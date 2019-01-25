package com.hpi.mysql2kdm.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "external_master0301")
public class ExternalMaster0301 implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "Date_Time")
    private Long dateTime;
    private Integer state;
    private Integer runCondition;
    private Float rpm;
    private Float shangdaobdxave;
    private Float shangdaobdxpp;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] shangdaobdx;
    private Float shangdaobdx1X;
    private Float shangdaobdx1Xp;
    private Float shangdaobdyave;
    private Float shangdaobdypp;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] shangdaobdy;
    private Float shangdaobdy1X;
    private Float shangdaobdy1Xp;
    private Float xiadaobdxave;
    private Float xiadaobdxpp;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] xiadaobdx;
    private Float xiadaobdx1X;
    private Float xiadaobdx1Xp;
    private Float xiadaobdyave;
    private Float xiadaobdypp;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] xiadaobdy;
    private Float xiadaobdy1X;
    private Float xiadaobdy1Xp;
    private Float shuidaobdxave;
    private Float shuidaobdxpp;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] shuidaobdx;
    private Float shuidaobdx1X;
    private Float shuidaobdx1Xp;
    private Float shuidaobdyave;
    private Float shuidaobdypp;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] shuidaobdy;
    private Float shuidaobdy1X;
    private Float shuidaobdy1Xp;
    private Float shangjijiazdxpp;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] shangjijiazdx;
    private Float shangjijiazdx1X;
    private Float shangjijiazdx1Xp;
    private Float shangjijiazdypp;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] shangjijiazdy;
    private Float shangjijiazdy1X;
    private Float shangjijiazdy1Xp;
    private Float shangjijiazdzpp;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] shangjijiazdz;
    private Float shangjijiazdz1X;
    private Float shangjijiazdz1Xp;
    private Float xiajijiazdxpp;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] xiajijiazdx;
    private Float xiajijiazdx1X;
    private Float xiajijiazdx1Xp;
    private Float xiajijiazdypp;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] xiajijiazdy;
    private Float xiajijiazdy1X;
    private Float xiajijiazdy1Xp;
    private Float xiajijiazdzpp;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] xiajijiazdz;
    private Float xiajijiazdz1X;
    private Float xiajijiazdz1Xp;
    private Float dinggaizdxpp;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] dinggaizdx;
    private Float dinggaizdx1X;
    private Float dinggaizdx1Xp;
    private Float dinggaizdypp;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] dinggaizdy;
    private Float dinggaizdy1X;
    private Float dinggaizdy1Xp;
    private Float dinggaizdzpp;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] dinggaizdz;
    private Float dinggaizdz1X;
    private Float dinggaizdz1Xp;
    private Float wokejkylave;
    private Float wokejkylpp;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] wokejkyl;
    private Float wokejkyl1X;
    private Float daoyeckylave;
    private Float daoyeckylpp;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] daoyeckyl;
    private Float daoyeckyl1X;
    private Float dinggaiylave;
    private Float dinggaiylpp;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] dinggaiyl;
    private Float dinggaiyl1X;
    private Float weishuiguanjkylave;
    private Float weishuiguanjkylpp;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] weishuiguanjkyl;
    private Float weishuiguanjkyl1X;
    private Float daoyekdave;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] daoyekd;
    private Float zzdaave;
    private Float zzdapp;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] zzda;
    private Float zzda1X;
    private Float zzda1Xp;
    private Float zzdbave;
    private Float zzdbpp;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] zzdb;
    private Float zzdb1X;
    private Float zzdb1Xp;
    private Float zzdcave;
    private Float zzdcpp;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] zzdc;
    private Float zzdc1X;
    private Float zzdc1Xp;
    private Float jizuliuliang;
    private Float jizujingshuitou;
    private Float xysw;
    private Integer fadianjichukoukg;
    private Integer licikg;
    private Float licidl;
    private Float licidy;

}
