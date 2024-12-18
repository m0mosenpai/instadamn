package X;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcelable;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.io.Serializable;

/* renamed from: X.Fd5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35094Fd5 {
    public static final void A01(Activity activity, C22P c22p, UserSession userSession, C81K c81k, PendingRecipient pendingRecipient, Integer num) {
        AbstractC167027dH.A12(userSession, activity, c22p);
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putParcelable(AbstractC111324zv.A00(78), pendingRecipient);
        A0b.putSerializable("camera_entry_point", c22p);
        A0b.putParcelable(AbstractC43591JPw.A00(822), null);
        A0b.putString(AbstractC111324zv.A00(2183), null);
        if (c81k != null) {
            A0b.putSerializable(AbstractC111324zv.A00(496), c81k);
        }
        C6XJ A02 = C6XJ.A02(activity, A0b, userSession, TransparentModalActivity.class, AbstractC111324zv.A00(51));
        A02.A07();
        if (num != null) {
            A02.A0A(activity, num.intValue());
        } else {
            A02.A0C(activity);
        }
    }

    public static Bundle A00(Parcelable parcelable, Serializable serializable, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("targetGroupProfile", parcelable);
        bundle.putSerializable("cameraEntryPoint", serializable);
        bundle.putBoolean(AbstractC111324zv.A00(1266), z);
        return bundle;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00c4, code lost:
    
        if (X.C18U.A06(r6, r23, 2342160732977763837L) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00c6, code lost:
    
        if (r26 != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00c8, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00d2, code lost:
    
        if (X.C18U.A06(r6, r23, 36327421800167996L) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00d7, code lost:
    
        if ((r21 instanceof X.InterfaceC53892dT) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00d9, code lost:
    
        if (r25 != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00db, code lost:
    
        r12 = X.C82R.A00(X.C128535rM.A00, new X.C81W[0]);
        r12.A00 = r10;
        ((X.InterfaceC53892dT) r21).FBp(new com.instagram.ui.swipenavigation.PositionConfig(null, r12, null, X.AbstractC111324zv.A00(2925), null, null, null, null, null, null, null, null, null, -1.0f, 0, r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x010e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x010f, code lost:
    
        r1 = A00(r24, r22, r10);
        r1.putBoolean(X.MSV.A00(54), r26);
        r0 = X.C6XJ.A02(r21, r1, r23, com.instagram.modal.TransparentModalActivity.class, X.AbstractC111324zv.A00(3268));
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d4, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0081, code lost:
    
        if (r26 != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008c, code lost:
    
        if (X.C18U.A06(r6, r23, 36327421800167996L) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008e, code lost:
    
        X.MX1.A01(r23).A04(r22);
        r3 = X.AbstractC69933Cc.A00(r21, r23, new X.C36324G0t(r21, 5));
        r2 = X.EnumC69983Ch.A02;
        r1 = A00(r24, r22, false);
        r1.putBoolean(X.MSV.A00(54), false);
        r3.A04(r1, X.EnumC33447EqK.A0J, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b3, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:
    
        if (r24 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0072, code lost:
    
        if (X.C18U.A06(r6, r23, 36314871908666246L) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0074, code lost:
    
        r6 = X.C06090Tz.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x007f, code lost:
    
        if (X.C18U.A06(r6, r23, 36317723763938812L) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00b4, code lost:
    
        X.MX1.A01(r23).A04(r22);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(android.app.Activity r21, X.C22P r22, com.instagram.common.session.UserSession r23, com.instagram.pendingmedia.model.recipients.PendingRecipient r24, boolean r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35094Fd5.A02(android.app.Activity, X.22P, com.instagram.common.session.UserSession, com.instagram.pendingmedia.model.recipients.PendingRecipient, boolean, boolean):void");
    }
}
