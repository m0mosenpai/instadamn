package X;

import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.List;

/* renamed from: X.LxC, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49681LxC implements InterfaceC95254Ql {
    public final LFZ A00 = LFZ.A01;
    public final InterfaceC95254Ql A01;
    public final C30P A02;

    private final C4SH A00(Object obj) {
        C30P c30p;
        if (obj == null || (c30p = this.A02) == null) {
            return null;
        }
        return c30p.A07(obj);
    }

    @Override // X.InterfaceC95254Ql
    public final void EHM(C75363a3 c75363a3) {
        this.A01.EHM(c75363a3);
    }

    @Override // X.InterfaceC95254Ql
    public final void EHU(C4SG c4sg, Object obj, String str, String str2, int i, int i2) {
        this.A01.EHU(c4sg, obj, str, str2, i, i2);
    }

    @Override // X.InterfaceC95254Ql
    public final void EHb(EnumC92424Bx enumC92424Bx, Object obj) {
        C14360o3.A0B(enumC92424Bx, 1);
        this.A01.EHb(enumC92424Bx, obj);
    }

    @Override // X.InterfaceC95254Ql
    public final void EHk(EnumC92424Bx enumC92424Bx, Object obj) {
        C14360o3.A0B(enumC92424Bx, 1);
        this.A01.EHk(enumC92424Bx, obj);
    }

    @Override // X.InterfaceC95254Ql
    public final void EHp(C53302cE c53302cE) {
        C14360o3.A0B(c53302cE, 0);
        this.A01.EHp(c53302cE);
    }

    @Override // X.InterfaceC95254Ql
    public final void EIX(C4SG c4sg, Object obj, int i, boolean z) {
        this.A01.EIX(c4sg, obj, i, z);
    }

    @Override // X.InterfaceC95254Ql
    public final void EIc(Object obj, boolean z) {
        this.A01.EIc(obj, z);
    }

    @Override // X.InterfaceC95254Ql
    public final void EId(C4SG c4sg, Object obj, String str) {
        this.A01.EId(c4sg, obj, str);
    }

    @Override // X.InterfaceC95254Ql
    public final void EIf(Object obj, int i) {
        this.A01.EIf(obj, i);
    }

    @Override // X.InterfaceC95254Ql
    public final void EIh(C4SG c4sg, Object obj, String str, String str2, String str3, String str4) {
        String str5;
        C14360o3.A0B(str2, 2);
        this.A01.EIh(c4sg, obj, str, str2, str3, null);
        C4SH A00 = A00(obj);
        LFZ lfz = this.A00;
        if (A00 != null) {
            str5 = A00.A0B;
        } else {
            str5 = null;
        }
        A01(lfz, "player_pause", str5);
    }

    @Override // X.InterfaceC95254Ql
    public final void EIi(C4SG c4sg, Object obj, int i) {
        this.A01.EIi(c4sg, obj, i);
    }

    @Override // X.InterfaceC95254Ql
    public final void EIk(C4SG c4sg, Object obj, int i) {
        this.A01.EIk(c4sg, obj, i);
    }

    @Override // X.InterfaceC95254Ql
    public final void EIm(C4SG c4sg, Object obj, String str, long j, boolean z, boolean z2, boolean z3) {
        String str2;
        C75363a3 c75363a3;
        C14360o3.A0B(str, 4);
        this.A01.EIm(c4sg, obj, str, j, z, z2, z3);
        C4SH A00 = A00(obj);
        LFZ lfz = this.A00;
        String str3 = null;
        if (A00 != null) {
            str2 = A00.A0B;
        } else {
            str2 = null;
        }
        if (A00 != null && (c75363a3 = A00.A04) != null) {
            str3 = c75363a3.A04();
        }
        lfz.A00("player_start", str2, "codec", str3);
    }

    @Override // X.InterfaceC95254Ql
    public final void EIn(C4SG c4sg, Object obj, int i, int i2, int i3) {
        this.A01.EIn(c4sg, obj, i, i2, i3);
    }

    @Override // X.InterfaceC95254Ql
    public final void EIp(Object obj) {
        this.A01.EIp(obj);
    }

    @Override // X.InterfaceC95254Ql
    public final void EIr(C4SG c4sg, Object obj) {
        this.A01.EIr(c4sg, obj);
    }

    @Override // X.InterfaceC95254Ql
    public final void EIs(Object obj, String str, String str2, String str3) {
        String str4;
        AbstractC167027dH.A13(str, str2, str3);
        this.A01.EIs(obj, str, str2, str3);
        C4SH A00 = A00(obj);
        LFZ lfz = this.A00;
        if (A00 != null) {
            str4 = A00.A0B;
        } else {
            str4 = null;
        }
        lfz.A00("video_warning", str4, "domain", str, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, str2, "msg", str3);
    }

    @Override // X.InterfaceC95254Ql
    public final void EIt(C4SG c4sg, Object obj, int i) {
        this.A01.EIt(c4sg, obj, i);
    }

    @Override // X.InterfaceC95254Ql
    public final void EHH(C121955fn c121955fn) {
        this.A01.EHH(c121955fn);
        this.A00.A00("abr_decision", c121955fn.A0Q, "reason", c121955fn.A0K, AbstractC111324zv.A00(384), c121955fn.A0J);
    }

    @Override // X.InterfaceC95254Ql
    public final void EIY(C4SG c4sg, Object obj, int i) {
        String str;
        this.A01.EIY(c4sg, obj, i);
        C4SH A00 = A00(obj);
        LFZ lfz = this.A00;
        if (A00 != null) {
            str = A00.A0B;
        } else {
            str = null;
        }
        A01(lfz, "buffering_finish", str);
    }

    @Override // X.InterfaceC95254Ql
    public final void EIZ(C4SG c4sg, Object obj, List list) {
        String str;
        this.A01.EIZ(c4sg, obj, list);
        C4SH A00 = A00(obj);
        LFZ lfz = this.A00;
        if (A00 != null) {
            str = A00.A0B;
        } else {
            str = null;
        }
        A01(lfz, "buffering_start", str);
    }

    @Override // X.InterfaceC95254Ql
    public final void EIa(C4SG c4sg, Object obj, String str, String str2, String str3) {
        String str4;
        AbstractC167027dH.A13(str, str2, str3);
        this.A01.EIa(c4sg, obj, str, str2, str3);
        C4SH A00 = A00(obj);
        LFZ lfz = this.A00;
        if (A00 != null) {
            str4 = A00.A0B;
        } else {
            str4 = null;
        }
        lfz.A00("video_error", str4, "domain", str, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, str2, "msg", str3);
    }

    @Override // X.InterfaceC95254Ql
    public final void EIe(C4SG c4sg, Object obj) {
        String str;
        this.A01.EIe(c4sg, obj);
        C4SH A00 = A00(obj);
        LFZ lfz = this.A00;
        if (A00 != null) {
            str = A00.A0B;
        } else {
            str = null;
        }
        A01(lfz, "prepare_start", str);
    }

    @Override // X.InterfaceC95254Ql
    public final void EIg(Object obj) {
        String str;
        this.A01.EIg(obj);
        C4SH A00 = A00(obj);
        LFZ lfz = this.A00;
        if (A00 != null) {
            str = A00.A0B;
        } else {
            str = null;
        }
        A01(lfz, "player_exit", str);
    }

    @Override // X.InterfaceC95254Ql
    public final void EIj(C4SG c4sg, Object obj, String str) {
        String str2;
        this.A01.EIj(c4sg, obj, str);
        C4SH A00 = A00(obj);
        LFZ lfz = this.A00;
        if (A00 != null) {
            str2 = A00.A0B;
        } else {
            str2 = null;
        }
        A01(lfz, "player_resume", str2);
    }

    @Override // X.InterfaceC95254Ql
    public final void EIl(C4SG c4sg, Object obj, String str, int i) {
        String str2;
        this.A01.EIl(c4sg, obj, str, i);
        C4SH A00 = A00(obj);
        LFZ lfz = this.A00;
        if (A00 != null) {
            str2 = A00.A0B;
        } else {
            str2 = null;
        }
        A01(lfz, "should_start", str2);
    }

    @Override // X.InterfaceC95254Ql
    public final void EIo(Object obj, String str, String str2, int i, long j) {
        String str3;
        this.A01.EIo(obj, str, str2, i, j);
        C4SH A00 = A00(obj);
        LFZ lfz = this.A00;
        if (A00 != null) {
            str3 = A00.A0B;
        } else {
            str3 = null;
        }
        A01(lfz, "video_rendered", str3);
    }

    @Override // X.InterfaceC95254Ql
    public final void EIq(C4SG c4sg, Object obj) {
        String str;
        this.A01.EIq(c4sg, obj);
        C4SH A00 = A00(obj);
        LFZ lfz = this.A00;
        if (A00 != null) {
            str = A00.A0B;
        } else {
            str = null;
        }
        A01(lfz, "size_change", str);
    }

    public C49681LxC(InterfaceC95254Ql interfaceC95254Ql, C30P c30p) {
        this.A02 = c30p;
        this.A01 = interfaceC95254Ql;
    }

    public static void A01(LFZ lfz, Object obj, Object obj2) {
        lfz.A00(obj, obj2);
    }
}
