package com.instagram.bloks.hosting;

import X.AbstractC12990ll;
import X.AbstractC25241Le;
import X.AbstractC58320PtC;
import X.AbstractC58321PtD;
import X.AbstractC66261U6f;
import X.AbstractC69784VvL;
import X.C05F;
import X.C102884kP;
import X.C1338462s;
import X.C18C;
import X.C191778eZ;
import X.C41M;
import X.C65981Txa;
import X.C69503VpY;
import X.C6BE;
import X.C70220WId;
import X.C71184WpW;
import X.InterfaceC103384lE;
import X.InterfaceC43590JPv;
import X.U5K;
import X.U6N;
import X.U6u;
import X.VR2;
import X.X9M;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes11.dex */
public class IgBloksScreenConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70220WId(22);
    public int A00;
    public X9M A01;
    public C71184WpW A02;
    public C69503VpY A03;
    public InterfaceC43590JPv A04;
    public AbstractC69784VvL A05;
    public C1338462s A06;
    public C1338462s A07;
    public C102884kP A08;
    public InterfaceC103384lE A09;
    public InterfaceC103384lE A0A;
    public AbstractC12990ll A0B;
    public C65981Txa A0C;
    public Integer A0D;
    public Integer A0E;
    public Integer A0F;
    public Integer A0G;
    public Integer A0H;
    public Integer A0I;
    public Integer A0J;
    public Integer A0K;
    public Integer A0L;
    public Integer A0M;
    public Integer A0N;
    public Integer A0O;
    public Integer A0P;
    public Integer A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public HashMap A0V;
    public HashMap A0W;
    public List A0X;
    public Map A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p;
    public Integer A0q;
    public Integer A0r;
    public final Set A0s;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    private int A00(Object obj) {
        if (this.A0o) {
            return AbstractC66261U6f.A00(obj);
        }
        return U6N.A00(this.A0B).A01(obj);
    }

    public static IgBloksScreenConfig A01(Bundle bundle, AbstractC12990ll abstractC12990ll) {
        C18C.A07(bundle, "Fragment must be passed args");
        C18C.A07(abstractC12990ll, "A valid session must be provided");
        IgBloksScreenConfig igBloksScreenConfig = (IgBloksScreenConfig) bundle.getParcelable("screen_config");
        if (igBloksScreenConfig == null) {
            return null;
        }
        igBloksScreenConfig.A0B = abstractC12990ll;
        U6N A00 = U6N.A00(abstractC12990ll);
        igBloksScreenConfig.A07 = (C1338462s) igBloksScreenConfig.A02(A00, C1338462s.class, igBloksScreenConfig.A0M);
        igBloksScreenConfig.A09 = (InterfaceC103384lE) igBloksScreenConfig.A02(A00, InterfaceC103384lE.class, igBloksScreenConfig.A0G);
        igBloksScreenConfig.A0A = (InterfaceC103384lE) igBloksScreenConfig.A02(A00, InterfaceC103384lE.class, igBloksScreenConfig.A0L);
        igBloksScreenConfig.A05 = (AbstractC69784VvL) igBloksScreenConfig.A02(A00, AbstractC69784VvL.class, igBloksScreenConfig.A0Q);
        igBloksScreenConfig.A03 = (C69503VpY) igBloksScreenConfig.A02(A00, C69503VpY.class, igBloksScreenConfig.A0H);
        igBloksScreenConfig.A06 = (C1338462s) igBloksScreenConfig.A02(A00, C1338462s.class, igBloksScreenConfig.A0J);
        igBloksScreenConfig.A0K = (Integer) igBloksScreenConfig.A02(A00, Integer.class, igBloksScreenConfig.A0K);
        igBloksScreenConfig.A08 = (C102884kP) igBloksScreenConfig.A02(A00, C102884kP.class, igBloksScreenConfig.A0I);
        igBloksScreenConfig.A0X = (List) igBloksScreenConfig.A02(A00, List.class, igBloksScreenConfig.A0O);
        igBloksScreenConfig.A0Y = (Map) igBloksScreenConfig.A02(A00, Map.class, igBloksScreenConfig.A0F);
        return igBloksScreenConfig;
    }

    private Object A02(U6N u6n, Class cls, Integer num) {
        Object obj;
        if (num != null) {
            this.A0s.add(num);
            if (this.A0o) {
                return AbstractC66261U6f.A01(cls, num);
            }
            int intValue = num.intValue();
            synchronized (u6n.A02) {
                try {
                    obj = cls.cast(u6n.A01.get(intValue));
                } catch (ClassCastException e) {
                    obj = null;
                    AbstractC25241Le.A00(null, "IgBloksDataCache", "Found mismatched types when retrieving data.", e);
                }
            }
            return obj;
        }
        return null;
    }

    public static void A03(Bundle bundle, IgBloksScreenConfig igBloksScreenConfig, boolean z) {
        igBloksScreenConfig.A0o = z;
        C1338462s c1338462s = igBloksScreenConfig.A07;
        if (c1338462s != null && igBloksScreenConfig.A0M == null) {
            igBloksScreenConfig.A0M = Integer.valueOf(igBloksScreenConfig.A00(c1338462s));
        }
        InterfaceC103384lE interfaceC103384lE = igBloksScreenConfig.A0A;
        if (interfaceC103384lE != null && igBloksScreenConfig.A0L == null) {
            igBloksScreenConfig.A0L = Integer.valueOf(igBloksScreenConfig.A00(interfaceC103384lE));
        }
        Map map = igBloksScreenConfig.A0Y;
        if (map != null && igBloksScreenConfig.A0F == null) {
            igBloksScreenConfig.A0F = Integer.valueOf(igBloksScreenConfig.A00(map));
        }
        AbstractC69784VvL abstractC69784VvL = igBloksScreenConfig.A05;
        if (abstractC69784VvL != null && igBloksScreenConfig.A0Q == null) {
            igBloksScreenConfig.A0Q = Integer.valueOf(igBloksScreenConfig.A00(abstractC69784VvL));
        }
        C69503VpY c69503VpY = igBloksScreenConfig.A03;
        if (c69503VpY != null && igBloksScreenConfig.A0H == null) {
            igBloksScreenConfig.A0H = Integer.valueOf(igBloksScreenConfig.A00(c69503VpY));
        }
        bundle.putParcelable("screen_config", igBloksScreenConfig);
    }

    public final C191778eZ A04() {
        return new C191778eZ(this.A0B, this.A0d, this.A0n, this.A0e);
    }

    public final void A05() {
        C18C.A07(this.A0B, "Can't destroy an uninitialized config!");
        Set<Integer> set = this.A0s;
        if (!set.isEmpty()) {
            U6N A00 = U6N.A00(this.A0B);
            for (Integer num : set) {
                if (this.A0o) {
                    AbstractC66261U6f.A03(num);
                } else {
                    A00.A03(num.intValue());
                }
            }
        }
    }

    public final void A06(U5K u5k) {
        this.A0U = u5k.A06;
        this.A0T = u5k.A05;
        this.A0k = !u5k.A0A;
        this.A0j = u5k.A08;
        this.A0m = !u5k.A09;
        C102884kP c102884kP = u5k.A03;
        if (c102884kP != null) {
            try {
                String A0G = c102884kP.A0G();
                int i = 0;
                if (A0G != null) {
                    i = C6BE.A03(A0G);
                }
                this.A0E = Integer.valueOf(i);
                String A0E = c102884kP.A0E();
                int i2 = 0;
                if (A0E != null) {
                    i2 = C6BE.A03(A0E);
                }
                this.A0D = Integer.valueOf(i2);
            } catch (C41M unused) {
                AbstractC25241Le.A02("invalid_themed_color", "Error parsing themed color for NavBar");
            }
        }
        U6N A00 = U6N.A00(this.A0B);
        Integer num = this.A0G;
        if (num != null) {
            A00.A03(num.intValue());
            this.A09 = null;
            this.A0G = null;
        }
        Integer num2 = this.A0J;
        if (num2 != null) {
            A00.A03(num2.intValue());
            this.A06 = null;
            this.A0J = null;
        }
        Integer num3 = this.A0K;
        if (num3 != null) {
            A00.A03(num3.intValue());
            this.A01 = null;
            this.A0K = null;
        }
        Integer num4 = this.A0I;
        if (num4 != null) {
            A00.A03(num4.intValue());
            this.A08 = null;
            this.A0I = null;
        }
        Integer num5 = this.A0O;
        if (num5 != null) {
            A00.A03(num5.intValue());
            this.A0X = null;
            this.A0O = null;
        }
        InterfaceC103384lE interfaceC103384lE = u5k.A04;
        if (interfaceC103384lE != null) {
            this.A09 = interfaceC103384lE;
            this.A0G = Integer.valueOf(A00(interfaceC103384lE));
        }
        C1338462s c1338462s = u5k.A01;
        if (c1338462s != null) {
            this.A06 = c1338462s;
            this.A0J = Integer.valueOf(A00(c1338462s));
        }
        X9M x9m = u5k.A00;
        if (x9m != null) {
            this.A01 = x9m;
            this.A0K = Integer.valueOf(A00(x9m));
        }
        C102884kP c102884kP2 = u5k.A02;
        if (c102884kP2 != null) {
            this.A08 = c102884kP2;
            this.A0I = Integer.valueOf(A00(c102884kP2));
        }
        List list = u5k.A07;
        if (list != null) {
            this.A0X = list;
            this.A0O = Integer.valueOf(A00(list));
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A0U);
        parcel.writeString(this.A0T);
        parcel.writeSerializable(this.A04);
        parcel.writeSerializable(this.A02);
        parcel.writeString(this.A0R);
        parcel.writeSerializable(this.A0W);
        parcel.writeSerializable(this.A0V);
        parcel.writeValue(this.A0N);
        parcel.writeInt(this.A0l ? 1 : 0);
        parcel.writeInt(this.A0i ? 1 : 0);
        parcel.writeInt(this.A0k ? 1 : 0);
        parcel.writeInt(this.A0j ? 1 : 0);
        parcel.writeInt(this.A0m ? 1 : 0);
        parcel.writeInt(this.A0f ? 1 : 0);
        parcel.writeInt(this.A0h ? 1 : 0);
        parcel.writeInt(this.A0g ? 1 : 0);
        parcel.writeInt(this.A0n ? 1 : 0);
        parcel.writeInt(this.A0e ? 1 : 0);
        parcel.writeInt(this.A0Z ? 1 : 0);
        parcel.writeValue(this.A0E);
        parcel.writeValue(this.A0D);
        parcel.writeValue(this.A0M);
        parcel.writeValue(this.A0G);
        parcel.writeValue(this.A0L);
        parcel.writeValue(this.A0Q);
        parcel.writeValue(this.A0H);
        parcel.writeInt(this.A0o ? 1 : 0);
        parcel.writeValue(this.A0J);
        parcel.writeValue(this.A0K);
        parcel.writeValue(this.A0I);
        parcel.writeValue(this.A0O);
        parcel.writeInt(this.A0c ? 1 : 0);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A0d ? 1 : 0);
        parcel.writeValue(this.A0F);
        parcel.writeString(U6u.A04(this.A0P));
        parcel.writeString(this.A0S);
        parcel.writeValue(this.A0q);
        parcel.writeValue(this.A0r);
        if (this.A0C == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeBundle(this.A0C.A00());
        }
        parcel.writeInt(this.A0b ? 1 : 0);
        parcel.writeInt(this.A0a ? 1 : 0);
    }

    public IgBloksScreenConfig(Parcel parcel) {
        this.A0b = false;
        this.A0a = false;
        this.A00 = 16;
        this.A0l = false;
        this.A0i = false;
        this.A0k = true;
        this.A0j = false;
        this.A0m = false;
        this.A0Z = true;
        this.A0f = false;
        this.A0h = false;
        this.A0g = false;
        this.A0n = false;
        this.A0e = false;
        this.A0p = false;
        this.A0o = false;
        this.A0d = false;
        this.A0P = C05F.A00;
        this.A0s = new HashSet();
        this.A0U = parcel.readString();
        this.A0T = parcel.readString();
        this.A04 = (InterfaceC43590JPv) parcel.readSerializable();
        this.A02 = (C71184WpW) parcel.readSerializable();
        this.A0R = parcel.readString();
        this.A0W = (HashMap) parcel.readSerializable();
        this.A0V = (HashMap) parcel.readSerializable();
        this.A0N = (Integer) AbstractC58321PtD.A0n(parcel, IgBloksScreenConfig.class);
        this.A0l = AbstractC58320PtC.A1U(parcel);
        this.A0i = AbstractC58320PtC.A1U(parcel);
        this.A0k = AbstractC58320PtC.A1U(parcel);
        this.A0j = AbstractC58320PtC.A1U(parcel);
        this.A0m = AbstractC58320PtC.A1U(parcel);
        this.A0f = AbstractC58320PtC.A1U(parcel);
        this.A0h = AbstractC58320PtC.A1U(parcel);
        this.A0g = AbstractC58320PtC.A1U(parcel);
        this.A0n = AbstractC58320PtC.A1U(parcel);
        this.A0e = AbstractC58320PtC.A1U(parcel);
        this.A0Z = AbstractC58320PtC.A1U(parcel);
        this.A0E = (Integer) AbstractC58321PtD.A0n(parcel, IgBloksScreenConfig.class);
        this.A0D = (Integer) AbstractC58321PtD.A0n(parcel, IgBloksScreenConfig.class);
        this.A0M = (Integer) AbstractC58321PtD.A0n(parcel, IgBloksScreenConfig.class);
        this.A0G = (Integer) AbstractC58321PtD.A0n(parcel, IgBloksScreenConfig.class);
        this.A0L = (Integer) AbstractC58321PtD.A0n(parcel, IgBloksScreenConfig.class);
        this.A0Q = (Integer) AbstractC58321PtD.A0n(parcel, IgBloksScreenConfig.class);
        this.A0H = (Integer) AbstractC58321PtD.A0n(parcel, IgBloksScreenConfig.class);
        this.A0o = AbstractC58320PtC.A1U(parcel);
        this.A0J = (Integer) AbstractC58321PtD.A0n(parcel, IgBloksScreenConfig.class);
        this.A0K = (Integer) AbstractC58321PtD.A0n(parcel, IgBloksScreenConfig.class);
        this.A0I = (Integer) AbstractC58321PtD.A0n(parcel, IgBloksScreenConfig.class);
        this.A0O = (Integer) AbstractC58321PtD.A0n(parcel, IgBloksScreenConfig.class);
        this.A0c = AbstractC58320PtC.A1U(parcel);
        this.A00 = parcel.readInt();
        this.A0d = AbstractC58320PtC.A1U(parcel);
        this.A0F = (Integer) AbstractC58321PtD.A0n(parcel, IgBloksScreenConfig.class);
        this.A0P = VR2.A00(parcel.readString());
        this.A0S = parcel.readString();
        this.A0q = (Integer) AbstractC58321PtD.A0n(parcel, IgBloksScreenConfig.class);
        this.A0r = (Integer) AbstractC58321PtD.A0n(parcel, IgBloksScreenConfig.class);
        if (parcel.readByte() == 1) {
            Bundle readBundle = parcel.readBundle(Bundle.class.getClassLoader());
            if (readBundle == null) {
                AbstractC25241Le.A02("IgBloksScreenConfig", "Parcelized CdsOpenScreenConfig should not be null");
            } else {
                this.A0C = C65981Txa.A0O.A00(readBundle);
            }
        }
        this.A0b = AbstractC58320PtC.A1U(parcel);
        this.A0a = parcel.readInt() == 1;
    }

    public IgBloksScreenConfig(AbstractC12990ll abstractC12990ll) {
        this.A0b = false;
        this.A0a = false;
        this.A00 = 16;
        this.A0l = false;
        this.A0i = false;
        this.A0k = true;
        this.A0j = false;
        this.A0m = false;
        this.A0Z = true;
        this.A0f = false;
        this.A0h = false;
        this.A0g = false;
        this.A0n = false;
        this.A0e = false;
        this.A0p = false;
        this.A0o = false;
        this.A0d = false;
        this.A0P = C05F.A00;
        this.A0s = new HashSet();
        this.A0B = abstractC12990ll;
    }
}
