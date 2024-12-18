package X;

import android.graphics.Bitmap;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.user.model.User;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.9Bd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206209Bd extends C0T6 {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public static final C206209Bd A00(C168557fp c168557fp, List list, List list2) {
        C14360o3.A0B(list, 0);
        C14360o3.A0B(list2, 1);
        C14360o3.A0B(c168557fp, 2);
        return new C206209Bd(c168557fp, list, list2);
    }

    public final void A03(EnumC46722Ck enumC46722Ck) {
        C14360o3.A0B(enumC46722Ck, 0);
        this.A02 = enumC46722Ck;
    }

    public static boolean A01(Object obj, int i) {
        if ((obj instanceof C206209Bd) && ((C206209Bd) obj).A03 == i) {
            return true;
        }
        return false;
    }

    public final C46742Cm A02() {
        return new C46742Cm((EnumC46732Cl) this.A01, (EnumC46722Ck) this.A02, (Map) this.A00);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C206209Bd.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C206209Bd.hashCode():int");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    public final String toString() {
        StringBuilder sb;
        Object obj;
        String str;
        switch (this.A03) {
            case 0:
                sb = new StringBuilder();
                sb.append("Builder(type=");
                sb.append(this.A02);
                sb.append(", contextAwareValueMap=");
                sb.append(this.A00);
                sb.append(", eligibleContext=");
                obj = this.A01;
                sb.append(obj);
                sb.append(')');
                return sb.toString();
            case 6:
                sb = new StringBuilder();
                sb.append("OneClickUpsell(visible=");
                sb.append(this.A02);
                sb.append(", type=");
                sb.append(this.A01);
                str = ", data=";
                sb.append(str);
                obj = this.A00;
                sb.append(obj);
                sb.append(')');
                return sb.toString();
            case 17:
                sb = new StringBuilder();
                sb.append("IABLoggingInfo(isAdClick=");
                sb.append(this.A01);
                sb.append(", isNoBounce=");
                sb.append(this.A02);
                str = ", clickStartTime=";
                sb.append(str);
                obj = this.A00;
                sb.append(obj);
                sb.append(')');
                return sb.toString();
            case 18:
                sb = new StringBuilder();
                sb.append("SignalEventType(signalType=");
                sb.append(this.A01);
                sb.append(", itemType=");
                sb.append(this.A00);
                sb.append(", surfaceType=");
                obj = this.A02;
                sb.append(obj);
                sb.append(')');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public final void A04(Map map) {
        this.A00 = map;
    }

    public C206209Bd() {
        this.A03 = 0;
        this.A03 = 0;
        EnumC46722Ck enumC46722Ck = EnumC46722Ck.A0F;
        C16920sk A0E = AbstractC06930Yk.A0E();
        EnumC46732Cl enumC46732Cl = EnumC46732Cl.A03;
        this.A03 = 0;
        C14360o3.A0B(A0E, 2);
        this.A02 = enumC46722Ck;
        this.A00 = A0E;
        this.A01 = enumC46732Cl;
    }

    public C206209Bd(int i, Object obj, Object obj2, Object obj3) {
        this.A03 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A00 = obj3;
    }

    public C206209Bd(InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2) {
        this.A03 = 12;
        C14360o3.A0B(interfaceC16660sJ2, 3);
        this.A00 = interfaceC16820sZ;
        this.A01 = interfaceC16660sJ;
        this.A02 = interfaceC16660sJ2;
    }

    public C206209Bd(InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, int i) {
        this.A03 = i;
        this.A00 = interfaceC16660sJ;
        this.A01 = interfaceC16660sJ2;
        this.A02 = interfaceC16820sZ;
    }

    public C206209Bd(EnumC46732Cl enumC46732Cl, EnumC46722Ck enumC46722Ck, Map map, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this.A03 = 0;
        EnumC46722Ck enumC46722Ck2 = EnumC46722Ck.A0F;
        C16920sk A0E = AbstractC06930Yk.A0E();
        EnumC46732Cl enumC46732Cl2 = EnumC46732Cl.A03;
        this.A03 = 0;
        C14360o3.A0B(A0E, 2);
        this.A02 = enumC46722Ck2;
        this.A00 = A0E;
        this.A01 = enumC46732Cl2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C206209Bd(C2DC c2dc, InterfaceC16820sZ interfaceC16820sZ) {
        this(c2dc, interfaceC16820sZ, (InterfaceC16820sZ) null);
        this.A03 = 10;
    }

    public C206209Bd(C2DC c2dc, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        this.A03 = 10;
        C14360o3.A0B(interfaceC16820sZ, 2);
        this.A02 = c2dc;
        this.A00 = interfaceC16820sZ;
        this.A01 = interfaceC16820sZ2;
    }

    public C206209Bd(EnumC64262vl enumC64262vl, AnonymousClass317 anonymousClass317, EnumC64222vh enumC64222vh) {
        this.A03 = 18;
        C14360o3.A0B(anonymousClass317, 1);
        C14360o3.A0B(enumC64262vl, 2);
        C14360o3.A0B(enumC64222vh, 3);
        this.A01 = anonymousClass317;
        this.A00 = enumC64262vl;
        this.A02 = enumC64222vh;
    }

    public C206209Bd(C77133cz c77133cz, C38321qM c38321qM, C75113Zb c75113Zb) {
        this.A03 = 9;
        C14360o3.A0B(c77133cz, 1);
        C14360o3.A0B(c75113Zb, 3);
        this.A02 = c77133cz;
        this.A00 = c38321qM;
        this.A01 = c75113Zb;
    }

    public C206209Bd(C1132359l c1132359l, C1132359l c1132359l2, C119565bE c119565bE) {
        this.A03 = 11;
        C14360o3.A0B(c119565bE, 1);
        this.A01 = c119565bE;
        this.A00 = c1132359l;
        this.A02 = c1132359l2;
    }

    public C206209Bd(C168557fp c168557fp, List list, List list2) {
        this.A03 = 1;
        this.A01 = list;
        this.A02 = list2;
        this.A00 = c168557fp;
    }

    public C206209Bd(C9BH c9bh, C86493tM c86493tM, C75113Zb c75113Zb) {
        this.A03 = 8;
        this.A01 = c86493tM;
        this.A00 = c9bh;
        this.A02 = c75113Zb;
    }

    public C206209Bd(C26086BgF c26086BgF, User user, List list) {
        this.A03 = 16;
        this.A02 = list;
        this.A00 = c26086BgF;
        this.A01 = user;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C206209Bd(C26086BgF c26086BgF, User user, List list, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this((C26086BgF) null, (User) null, C16930sl.A00);
        this.A03 = 16;
    }

    public C206209Bd(C50525MSe c50525MSe, C0f6 c0f6, C5IX c5ix) {
        this.A03 = 2;
        C14360o3.A0B(c50525MSe, 1);
        C14360o3.A0B(c0f6, 2);
        this.A02 = c50525MSe;
        this.A00 = c0f6;
        this.A01 = c5ix;
    }

    public C206209Bd(Bitmap bitmap, C9ZP c9zp, EnumC27378C6h enumC27378C6h) {
        this.A03 = 5;
        C14360o3.A0B(enumC27378C6h, 1);
        C14360o3.A0B(bitmap, 2);
        C14360o3.A0B(c9zp, 3);
        this.A02 = enumC27378C6h;
        this.A01 = bitmap;
        this.A00 = c9zp;
    }

    public C206209Bd(GalleryItem galleryItem, Bitmap bitmap) {
        this.A03 = 4;
        UUID randomUUID = UUID.randomUUID();
        this.A03 = 4;
        C14360o3.A0B(randomUUID, 3);
        this.A01 = galleryItem;
        this.A00 = bitmap;
        this.A02 = randomUUID;
    }
}
