package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;

/* renamed from: X.FyV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36216FyV implements InterfaceC66482zP {
    public boolean A00 = false;
    public final int A01;
    public final VKF A02;
    public final Integer A03;
    public final Integer A04;
    public final Object A05;

    public C36216FyV(VKF vkf, Integer num, Integer num2) {
        int i;
        switch (num.intValue()) {
            case 17:
                i = 2131964646;
                break;
            case 18:
                i = 2131968949;
                break;
            case Process.SIGSTOP /* 19 */:
                i = 2131960559;
                break;
            case 20:
                i = 2131968950;
                break;
            case 21:
                i = 2131968951;
                break;
            case 22:
                i = 2131968952;
                break;
            case 23:
                i = 2131969955;
                break;
            case 24:
                i = 2131964465;
                break;
            case 25:
                i = 2131964466;
                break;
            case 26:
                i = 2131964464;
                break;
            default:
                AbstractC31265Don.A00();
                i = 2131960402;
                break;
        }
        this.A01 = i;
        this.A04 = C05F.A01;
        this.A03 = num2;
        this.A02 = vkf;
        this.A05 = null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C36216FyV c36216FyV = (C36216FyV) obj;
                Object obj2 = this.A05;
                Object obj3 = c36216FyV.A05;
                if (obj2 != null) {
                    return obj3 != null && this.A01 == c36216FyV.A01 && obj2.equals(obj3);
                }
                if (obj3 != null || this.A01 != c36216FyV.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this;
    }

    public static void A00(VKF vkf, Integer num, Integer num2, Object obj, List list) {
        list.add(new C36216FyV(vkf, num, num2, obj));
    }

    public final int hashCode() {
        int i = this.A01;
        Object obj = this.A05;
        if (obj != null) {
            return AbstractC166987dD.A0I(obj, i * 31);
        }
        return i;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        if (hashCode() != obj.hashCode()) {
            return false;
        }
        return equals(obj);
    }

    public C36216FyV(VKF vkf, Integer num, Integer num2, Object obj) {
        int i;
        Integer num3;
        switch (num.intValue()) {
            case 0:
                i = 2131964461;
                break;
            case 1:
                i = 2131964456;
                break;
            case 2:
                i = 2131964462;
                break;
            case 3:
                i = 2131964467;
                break;
            case 4:
                i = 2131964468;
                break;
            case 5:
                i = 2131964455;
                break;
            case 6:
                i = 2131964450;
                break;
            case 7:
                i = 2131964451;
                break;
            case 8:
                i = 2131964448;
                break;
            case 9:
                i = 2131964460;
                break;
            case 10:
                i = 2131964458;
                break;
            case 11:
                i = 2131964459;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                i = 2131964453;
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                i = 2131964441;
                break;
            case 14:
                i = 2131964457;
                break;
            case Process.SIGTERM /* 15 */:
                i = 2131964449;
                break;
            case 16:
                i = 2131964447;
                break;
            case 17:
                i = 2131964646;
                break;
            case 18:
                i = 2131968949;
                break;
            case Process.SIGSTOP /* 19 */:
                i = 2131960559;
                break;
            case 20:
                i = 2131968950;
                break;
            case 21:
                i = 2131968951;
                break;
            case 22:
                i = 2131968952;
                break;
            case 23:
                i = 2131969955;
                break;
            case 24:
                i = 2131964465;
                break;
            case 25:
                i = 2131964466;
                break;
            case 26:
                i = 2131964464;
                break;
            case 27:
                AbstractC31265Don.A00();
                i = 2131960402;
                break;
            case 28:
                AbstractC31265Don.A00();
                i = 2131960412;
                break;
            default:
                AbstractC31265Don.A00();
                i = 2131960572;
                break;
        }
        this.A01 = i;
        if (num == C05F.A15) {
            num3 = C05F.A00;
        } else if (num == C05F.A0M) {
            num3 = C05F.A0C;
        } else {
            num3 = C05F.A01;
        }
        this.A04 = num3;
        this.A03 = num2;
        this.A02 = vkf;
        this.A05 = obj;
    }
}
