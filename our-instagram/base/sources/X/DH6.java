package X;

import androidx.fragment.app.Fragment;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* loaded from: classes5.dex */
public final class DH6 extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DH6(C29166CtX c29166CtX, String str, String str2, int i) {
        super(0);
        this.A00 = i;
        this.A01 = c29166CtX;
        if (15 - i != 0) {
            this.A03 = str;
            this.A02 = str2;
        } else {
            this.A02 = str;
            this.A03 = str2;
        }
    }

    public static IllegalStateException A00(DH6 dh6) {
        return new IllegalStateException(AnonymousClass001.A0R("Argument not found for ", dh6.A03));
    }

    public static InterfaceC09390do A01(Object obj, String str, EnumC09460dv enumC09460dv, int i) {
        return AbstractC09440dt.A00(enumC09460dv, new DH6(obj, str, str, i));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final Object invoke() {
        switch (this.A00) {
            case 0:
                Object A0n = AbstractC25235BEs.A0n(EnumC09460dv.A02, new D6F((Fragment) this.A01, this.A02));
                if (A0n != null) {
                    return A0n;
                }
                throw A00(this);
            case 1:
                Object A0n2 = AbstractC25235BEs.A0n(EnumC09460dv.A02, new D6G((Fragment) this.A01, this.A02));
                if (A0n2 != null) {
                    return A0n2;
                }
                throw A00(this);
            case 2:
                Object A0n3 = AbstractC25235BEs.A0n(EnumC09460dv.A02, new D6H((Fragment) this.A01, this.A02));
                if (A0n3 != null) {
                    return A0n3;
                }
                throw A00(this);
            case 3:
                Object A0n4 = AbstractC25235BEs.A0n(EnumC09460dv.A02, new D6I((Fragment) this.A01, this.A02));
                if (A0n4 != null) {
                    return A0n4;
                }
                throw A00(this);
            case 4:
                Object A0n5 = AbstractC25235BEs.A0n(EnumC09460dv.A02, new D6J((Fragment) this.A01, this.A02));
                if (A0n5 != null) {
                    return A0n5;
                }
                throw A00(this);
            case 5:
                Object A0n6 = AbstractC25235BEs.A0n(EnumC09460dv.A02, new D6K((Fragment) this.A01, this.A02));
                if (A0n6 != null) {
                    return A0n6;
                }
                throw A00(this);
            case 6:
                Object A0n7 = AbstractC25235BEs.A0n(EnumC09460dv.A02, new D6L((Fragment) this.A01, this.A02));
                if (A0n7 != null) {
                    return A0n7;
                }
                throw A00(this);
            case 7:
                Object A0n8 = AbstractC25235BEs.A0n(EnumC09460dv.A02, new D6M((Fragment) this.A01, this.A02));
                if (A0n8 != null) {
                    return A0n8;
                }
                throw A00(this);
            case 8:
                Object A0n9 = AbstractC25235BEs.A0n(EnumC09460dv.A02, new D6N((Fragment) this.A01, this.A02));
                if (A0n9 != null) {
                    return A0n9;
                }
                throw A00(this);
            case 9:
                Object A0n10 = AbstractC25235BEs.A0n(EnumC09460dv.A02, new D6O((Fragment) this.A01, this.A02));
                if (A0n10 != null) {
                    return A0n10;
                }
                throw A00(this);
            case 10:
                Object A0n11 = AbstractC25235BEs.A0n(EnumC09460dv.A02, new D6P((Fragment) this.A01, this.A02));
                if (A0n11 != null) {
                    return A0n11;
                }
                throw A00(this);
            case 11:
                Object A0n12 = AbstractC25235BEs.A0n(EnumC09460dv.A02, new D6Q((Fragment) this.A01, this.A02));
                if (A0n12 != null) {
                    return A0n12;
                }
                throw A00(this);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                Object A0n13 = AbstractC25235BEs.A0n(EnumC09460dv.A02, new D6R((Fragment) this.A01, this.A02));
                if (A0n13 != null) {
                    return A0n13;
                }
                throw A00(this);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                Object A0n14 = AbstractC25235BEs.A0n(EnumC09460dv.A02, new D6S((Fragment) this.A01, this.A02));
                if (A0n14 != null) {
                    return A0n14;
                }
                throw A00(this);
            case 14:
                Object A0n15 = AbstractC25235BEs.A0n(EnumC09460dv.A02, new D6T((Fragment) this.A01, this.A02));
                if (A0n15 != null) {
                    return A0n15;
                }
                throw A00(this);
            case Process.SIGTERM /* 15 */:
                C29166CtX c29166CtX = (C29166CtX) this.A01;
                ((UserFlowLoggerImpl) c29166CtX.A02.getValue()).flowAnnotate(c29166CtX.A00, this.A02, this.A03);
                return C0eB.A00;
            case 16:
                C29166CtX c29166CtX2 = (C29166CtX) this.A01;
                ((UserFlowLoggerImpl) c29166CtX2.A02.getValue()).flowMarkPoint(c29166CtX2.A00, this.A03, this.A02);
                return C0eB.A00;
            case 17:
                Object A0n16 = AbstractC25235BEs.A0n(EnumC09460dv.A02, new D6U((Fragment) this.A01, this.A02));
                if (A0n16 != null) {
                    return A0n16;
                }
                throw A00(this);
            case 18:
                Object A0n17 = AbstractC25235BEs.A0n(EnumC09460dv.A02, new D6W((Fragment) this.A01, this.A02));
                if (A0n17 != null) {
                    return A0n17;
                }
                throw A00(this);
            case Process.SIGSTOP /* 19 */:
                Object A0n18 = AbstractC25235BEs.A0n(EnumC09460dv.A02, new D6X((Fragment) this.A01, this.A02));
                if (A0n18 != null) {
                    return A0n18;
                }
                throw A00(this);
            case 20:
            case 21:
            default:
                ((InterfaceC132365yF) this.A01).CrW(this.A02, this.A03);
                return C0eB.A00;
            case 22:
                ((C5yI) this.A01).DCr(this.A03, this.A02);
                return C0eB.A00;
            case 23:
                ((InterfaceC16620sF) this.A01).invoke(this.A02, this.A03);
                return C0eB.A00;
            case 24:
                Object A0n19 = AbstractC25235BEs.A0n(EnumC09460dv.A02, new D6Y((Fragment) this.A01, this.A02));
                if (A0n19 != null) {
                    return A0n19;
                }
                throw A00(this);
            case 25:
                Object A0n20 = AbstractC25235BEs.A0n(EnumC09460dv.A02, new D6Z((Fragment) this.A01, this.A02));
                if (A0n20 != null) {
                    return A0n20;
                }
                throw A00(this);
            case 26:
                Object A0n21 = AbstractC25235BEs.A0n(EnumC09460dv.A02, new C29658D6a((Fragment) this.A01, this.A02));
                if (A0n21 != null) {
                    return A0n21;
                }
                throw A00(this);
            case 27:
                Object A0n22 = AbstractC25235BEs.A0n(EnumC09460dv.A02, new C29659D6b((Fragment) this.A01, this.A02));
                if (A0n22 != null) {
                    return A0n22;
                }
                throw A00(this);
            case 28:
                Object A0n23 = AbstractC25235BEs.A0n(EnumC09460dv.A02, new C29660D6c((Fragment) this.A01, this.A02));
                if (A0n23 != null) {
                    return A0n23;
                }
                throw A00(this);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                Object A0n24 = AbstractC25235BEs.A0n(EnumC09460dv.A02, new C29665D6h((Fragment) this.A01, this.A02));
                if (A0n24 != null) {
                    return A0n24;
                }
                throw A00(this);
            case 30:
                Object A0n25 = AbstractC25235BEs.A0n(EnumC09460dv.A02, new C29667D6j((Fragment) this.A01, this.A02));
                if (A0n25 != null) {
                    return A0n25;
                }
                throw A00(this);
            case 31:
                Object A0n26 = AbstractC25235BEs.A0n(EnumC09460dv.A02, new C29668D6k((Fragment) this.A01, this.A02));
                if (A0n26 != null) {
                    return A0n26;
                }
                throw A00(this);
            case 32:
                Object A0n27 = AbstractC25235BEs.A0n(EnumC09460dv.A02, new C29669D6l((Fragment) this.A01, this.A02));
                if (A0n27 != null) {
                    return A0n27;
                }
                throw A00(this);
            case 33:
                Object A0n28 = AbstractC25235BEs.A0n(EnumC09460dv.A02, new C29670D6m((Fragment) this.A01, this.A02));
                if (A0n28 != null) {
                    return A0n28;
                }
                throw A00(this);
            case 34:
                Object A0n29 = AbstractC25235BEs.A0n(EnumC09460dv.A02, new C29672D6o((Fragment) this.A01, this.A02));
                if (A0n29 != null) {
                    return A0n29;
                }
                throw A00(this);
            case 35:
                Object A0n30 = AbstractC25235BEs.A0n(EnumC09460dv.A02, new C29673D6p((Fragment) this.A01, this.A02));
                if (A0n30 != null) {
                    return A0n30;
                }
                throw A00(this);
            case 36:
                Object A0n31 = AbstractC25235BEs.A0n(EnumC09460dv.A02, new C29674D6q((Fragment) this.A01, this.A02));
                if (A0n31 != null) {
                    return A0n31;
                }
                throw A00(this);
            case 37:
                Object A0n32 = AbstractC25235BEs.A0n(EnumC09460dv.A02, new C29675D6r((Fragment) this.A01, this.A02));
                if (A0n32 != null) {
                    return A0n32;
                }
                throw A00(this);
            case 38:
                Object A0n33 = AbstractC25235BEs.A0n(EnumC09460dv.A02, new C29676D6s((Fragment) this.A01, this.A02));
                if (A0n33 != null) {
                    return A0n33;
                }
                throw A00(this);
            case 39:
                Object A0n34 = AbstractC25235BEs.A0n(EnumC09460dv.A02, new C29680D6w((Fragment) this.A01, this.A02));
                if (A0n34 != null) {
                    return A0n34;
                }
                throw A00(this);
            case 40:
                Object A0n35 = AbstractC25235BEs.A0n(EnumC09460dv.A02, new C29681D6x((Fragment) this.A01, this.A02));
                if (A0n35 != null) {
                    return A0n35;
                }
                throw A00(this);
            case Seq.NULL_REFNUM /* 41 */:
                Object A0n36 = AbstractC25235BEs.A0n(EnumC09460dv.A02, new C29682D6y((Fragment) this.A01, this.A02));
                if (A0n36 != null) {
                    return A0n36;
                }
                throw A00(this);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                Object A0n37 = AbstractC25235BEs.A0n(EnumC09460dv.A02, new C29683D6z((Fragment) this.A01, this.A02));
                if (A0n37 != null) {
                    return A0n37;
                }
                throw A00(this);
            case 43:
                Object A0n38 = AbstractC25235BEs.A0n(EnumC09460dv.A02, new D70((Fragment) this.A01, this.A02));
                if (A0n38 != null) {
                    return A0n38;
                }
                throw A00(this);
            case 44:
                Object A0n39 = AbstractC25235BEs.A0n(EnumC09460dv.A02, new D72((Fragment) this.A01, this.A02));
                if (A0n39 != null) {
                    return A0n39;
                }
                throw A00(this);
            case 45:
                Object A0n40 = AbstractC25235BEs.A0n(EnumC09460dv.A02, new D73((Fragment) this.A01, this.A02));
                if (A0n40 != null) {
                    return A0n40;
                }
                throw A00(this);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                Object A0n41 = AbstractC25235BEs.A0n(EnumC09460dv.A02, new D74((Fragment) this.A01, this.A02));
                if (A0n41 != null) {
                    return A0n41;
                }
                throw A00(this);
            case 47:
                Object A0n42 = AbstractC25235BEs.A0n(EnumC09460dv.A02, new D75((Fragment) this.A01, this.A02));
                if (A0n42 != null) {
                    return A0n42;
                }
                throw A00(this);
            case 48:
                Object A0n43 = AbstractC25235BEs.A0n(EnumC09460dv.A02, new D77((Fragment) this.A01, this.A02));
                if (A0n43 != null) {
                    return A0n43;
                }
                throw A00(this);
            case 49:
                Object A0n44 = AbstractC25235BEs.A0n(EnumC09460dv.A02, new D78((Fragment) this.A01, this.A02));
                if (A0n44 != null) {
                    return A0n44;
                }
                throw A00(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DH6(Object obj, String str, String str2, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
        this.A03 = str2;
    }
}
