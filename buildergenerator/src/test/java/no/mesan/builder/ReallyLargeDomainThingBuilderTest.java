package no.mesan.builder;

import junit.framework.Assert;

import org.junit.Test;

public class ReallyLargeDomainThingBuilderTest {

    @Test
    public void testSimpleBuild() {
        ReallyLargeDomainThingBuilder builder = new ReallyLargeDomainThingBuilder();
        ReallyLargeDomainThing domainThing = builder.allocatedRes("me")
               .appointmentID("id1")
               .build();
        Assert.assertEquals("id1", domainThing.getAppointmentID());
    }
}
