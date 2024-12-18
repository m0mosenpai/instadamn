package X;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.react.modules.base.IgReactQEModule;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.9BW, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9BW extends C0T6 {
    public Object A00;
    public Object A01;
    public final int A02;

    public static final C9BW A00(C206209Bd c206209Bd, C167297di c167297di) {
        C14360o3.A0B(c167297di, 0);
        C14360o3.A0B(c206209Bd, 1);
        return new C9BW(c206209Bd, c167297di);
    }

    public static boolean A01(Object obj, int i) {
        if ((obj instanceof C9BW) && ((C9BW) obj).A02 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9BW.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9BW.hashCode():int");
    }

    public final String toString() {
        StringBuilder sb;
        String str;
        String str2;
        switch (this.A02) {
            case 18:
                sb = new StringBuilder();
                sb.append("IrisInboxNavigationStatus(status=");
                Number number = (Number) this.A01;
                if (number != null) {
                    switch (number.intValue()) {
                        case 1:
                            str = "AWAITING_DELTAS";
                            break;
                        case 2:
                            str = "UP_TO_DATE";
                            break;
                        default:
                            str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                            break;
                    }
                } else {
                    str = "null";
                }
                sb.append(str);
                str2 = ", prefetchTimeMs=";
                break;
            case 21:
                sb = new StringBuilder();
                sb.append("MediaDeserializerResultOrException(media=");
                sb.append(this.A01);
                str2 = AbstractC111324zv.A00(279);
                break;
            case 30:
                sb = new StringBuilder();
                sb.append("Metadata(voiceEffect=");
                sb.append(this.A01);
                str2 = ", soundEffects=";
                break;
            case 34:
                sb = new StringBuilder();
                sb.append("SignalBundle(signalMetadata=");
                sb.append(this.A01);
                str2 = ", signalData=";
                break;
            default:
                return super.toString();
        }
        sb.append(str2);
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public C9BW() {
        this.A02 = 30;
        C16930sl c16930sl = C16930sl.A00;
        this.A02 = 30;
        C14360o3.A0B(c16930sl, 2);
        this.A01 = null;
        this.A00 = c16930sl;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9BW(int i) {
        this();
        Object obj;
        int i2;
        this.A02 = i;
        switch (i) {
            case 9:
                this.A02 = 9;
                this(new ArrayList(), C16930sl.A00, 9);
                return;
            case 10:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case 18:
            default:
                return;
            case 11:
                obj = null;
                i2 = 11;
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                this(new MessageIdentifier("", null), C05F.A00);
                return;
            case 14:
                obj = null;
                i2 = 14;
                break;
            case Process.SIGTERM /* 15 */:
                obj = null;
                i2 = 15;
                break;
            case 16:
                obj = null;
                i2 = 16;
                break;
            case 17:
                this.A02 = 17;
                this((List) null, (List) null, 17);
                return;
            case Process.SIGSTOP /* 19 */:
                obj = null;
                i2 = 19;
                break;
        }
        this.A02 = i2;
        this(i2, obj, obj);
    }

    public C9BW(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A01 = obj;
        this.A00 = obj2;
    }

    public C9BW(EnumC73363Qm enumC73363Qm, Integer num) {
        this.A02 = 29;
        C14360o3.A0B(enumC73363Qm, 2);
        this.A00 = num;
        this.A01 = enumC73363Qm;
    }

    public C9BW(C75363a3 c75363a3, WeakReference weakReference) {
        this.A02 = 38;
        this.A00 = c75363a3;
        this.A01 = weakReference;
    }

    public C9BW(InterfaceC75403a7 interfaceC75403a7, EnumC65592xv enumC65592xv) {
        this.A02 = 24;
        C14360o3.A0B(interfaceC75403a7, 2);
        this.A00 = enumC65592xv;
        this.A01 = interfaceC75403a7;
    }

    public C9BW(C4dV c4dV, C119835bh c119835bh) {
        this.A02 = 22;
        C14360o3.A0B(c119835bh, 2);
        this.A00 = c4dV;
        this.A01 = c119835bh;
    }

    public C9BW(C7DT c7dt, Integer num) {
        this.A02 = 10;
        this.A00 = num;
        this.A01 = c7dt;
    }

    public C9BW(C7JN c7jn, InterfaceC164227Wl interfaceC164227Wl) {
        this.A02 = 12;
        this.A01 = interfaceC164227Wl;
        this.A00 = c7jn;
    }

    public C9BW(C8DO c8do, C8DO[] c8doArr) {
        this.A02 = 5;
        C14360o3.A0B(c8doArr, 1);
        C14360o3.A0B(c8do, 2);
        this.A00 = c8doArr;
        this.A01 = c8do;
    }

    public C9BW(C206209Bd c206209Bd, C167297di c167297di) {
        this.A02 = 2;
        this.A01 = c167297di;
        this.A00 = c206209Bd;
    }

    public C9BW(C9C7 c9c7, AbstractC82583mM abstractC82583mM) {
        this.A02 = 34;
        C14360o3.A0B(abstractC82583mM, 2);
        this.A01 = c9c7;
        this.A00 = abstractC82583mM;
    }

    public C9BW(Intent intent, Integer num) {
        this.A02 = 37;
        this.A00 = num;
        this.A01 = intent;
    }

    public C9BW(Bitmap bitmap, C128175qm c128175qm) {
        this.A02 = 8;
        C14360o3.A0B(c128175qm, 1);
        this.A00 = c128175qm;
        this.A01 = bitmap;
    }

    public C9BW(Bundle bundle, C50758MbO c50758MbO) {
        this.A02 = 32;
        this.A01 = bundle;
        this.A00 = c50758MbO;
    }

    public C9BW(UserSession userSession, QuickPromotionSlot quickPromotionSlot) {
        this.A02 = 31;
        this.A00 = userSession;
        this.A01 = quickPromotionSlot;
    }

    public C9BW(MessageIdentifier messageIdentifier, Integer num) {
        this.A02 = 13;
        C14360o3.A0B(messageIdentifier, 1);
        C14360o3.A0B(num, 2);
        this.A00 = messageIdentifier;
        this.A01 = num;
    }

    public C9BW(Integer num) {
        this.A02 = 18;
        this.A01 = num;
        this.A00 = null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9BW(Integer num, Integer num2, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this(11, (Object) null, num);
        this.A02 = 11;
    }

    public C9BW(Object obj, WeakReference weakReference) {
        this.A02 = 6;
        this.A00 = obj;
        this.A01 = weakReference;
    }

    public C9BW(WeakReference weakReference, java.util.Set set) {
        this.A02 = 3;
        this.A00 = set;
        this.A01 = weakReference;
    }

    public C9BW(List list, List list2, int i) {
        this.A02 = i;
        if (9 - i != 0) {
            this.A00 = list;
            this.A01 = list2;
        } else {
            C14360o3.A0B(list, 1);
            C14360o3.A0B(list2, 2);
            this.A01 = list;
            this.A00 = list2;
        }
    }
}
