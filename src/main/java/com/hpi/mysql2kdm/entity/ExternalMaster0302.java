package com.hpi.mysql2kdm.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "external_master0302")
public class ExternalMaster0302 implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "Date_Time")
    private Long dateTime;
    private Integer state;
    private Integer runCondition;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] airgapx;
    private Float airgapxpole1;
    private Float airgapxpole2;
    private Float airgapxpole3;
    private Float airgapxpole4;
    private Float airgapxpole5;
    private Float airgapxpole6;
    private Float airgapxpole7;
    private Float airgapxpole8;
    private Float airgapxpole9;
    private Float airgapxpole10;
    private Float airgapxpole11;
    private Float airgapxpole12;
    private Float airgapxpole13;
    private Float airgapxpole14;
    private Float airgapxpole15;
    private Float airgapxpole16;
    private Float airgapxpole17;
    private Float airgapxpole18;
    private Float airgapxpole19;
    private Float airgapxpole20;
    private Float airgapxpole21;
    private Float airgapxpole22;
    private Float airgapxpole23;
    private Float airgapxpole24;
    private Float airgapxpole25;
    private Float airgapxpole26;
    private Float airgapxpole27;
    private Float airgapxpole28;
    private Float airgapxpole29;
    private Float airgapxpole30;
    private Float airgapxpole31;
    private Float airgapxpole32;
    private Float airgapxpole33;
    private Float airgapxpole34;
    private Float airgapxpole35;
    private Float airgapxpole36;
    private Float airgapxave;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] airgapxy;
    private Float airgapxyave;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] airgapy;
    private Float airgapyave;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] airgapfxy;
    private Float airgapfxyave;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] airgapfx;
    private Float airgapfxave;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] airgapfxfy;
    private Float airgapfxfyave;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] airgapfy;
    private Float airgapfyave;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] airgapxfy;
    private Float airgapxfyave;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] ccq;
    private Float ccqpole1;
    private Float ccqpole1Diff;
    private Float ccqpole2;
    private Float ccqpole2Diff;
    private Float ccqpole3;
    private Float ccqpole3Diff;
    private Float ccqpole4;
    private Float ccqpole4Diff;
    private Float ccqpole5;
    private Float ccqpole5Diff;
    private Float ccqpole6;
    private Float ccqpole6Diff;
    private Float ccqpole7;
    private Float ccqpole7Diff;
    private Float ccqpole8;
    private Float ccqpole8Diff;
    private Float ccqpole9;
    private Float ccqpole9Diff;
    private Float ccqpole10;
    private Float ccqpole10Diff;
    private Float ccqpole11;
    private Float ccqpole11Diff;
    private Float ccqpole12;
    private Float ccqpole12Diff;
    private Float ccqpole13;
    private Float ccqpole13Diff;
    private Float ccqpole14;
    private Float ccqpole14Diff;
    private Float ccqpole15;
    private Float ccqpole15Diff;
    private Float ccqpole16;
    private Float ccqpole16Diff;
    private Float ccqpole17;
    private Float ccqpole17Diff;
    private Float ccqpole18;
    private Float ccqpole18Diff;
    private Float ccqpole19;
    private Float ccqpole19Diff;
    private Float ccqpole20;
    private Float ccqpole20Diff;
    private Float ccqpole21;
    private Float ccqpole21Diff;
    private Float ccqpole22;
    private Float ccqpole22Diff;
    private Float ccqpole23;
    private Float ccqpole23Diff;
    private Float ccqpole24;
    private Float ccqpole24Diff;
    private Float ccqpole25;
    private Float ccqpole25Diff;
    private Float ccqpole26;
    private Float ccqpole26Diff;
    private Float ccqpole27;
    private Float ccqpole27Diff;
    private Float ccqpole28;
    private Float ccqpole28Diff;
    private Float ccqpole29;
    private Float ccqpole29Diff;
    private Float ccqpole30;
    private Float ccqpole30Diff;
    private Float ccqpole31;
    private Float ccqpole31Diff;
    private Float ccqpole32;
    private Float ccqpole32Diff;
    private Float ccqpole33;
    private Float ccqpole33Diff;
    private Float ccqpole34;
    private Float ccqpole34Diff;
    private Float ccqpole35;
    private Float ccqpole35Diff;
    private Float ccqpole36;
    private Float ccqpole36Diff;
    private Float ccqplusave;
    private Float ccqminusave;
    private Float agmin;
    private Float aghmin;
    private Float xwmin;
    private Float agmax;
    private Float aghmax;
    private Float xwmax;
    private Float zzbyd;
    private Float dzbyd;
    private Float zzpx;
    private Float zzpxxw;
    private Float dzpx;
    private Float dzpxxw;
    private Float agave;
    private Float ccqave;
    private Float ccqmin;
    private Float ccqminper;
    private Float ccqhmin;
    private Float ccqmax;
    private Float ccqmaxper;
    private Float ccqhmax;
    private Float ccqbyd;

}
