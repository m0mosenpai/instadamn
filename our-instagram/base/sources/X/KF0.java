package X;

import android.content.Context;
import android.os.SystemClock;
import com.instagram.pendingmedia.model.ClipInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes8.dex */
public final class KF0 extends U7H {
    public final /* synthetic */ C44272JhO A00;

    public KF0(C44272JhO c44272JhO) {
        this.A00 = c44272JhO;
    }

    @Override // X.U7H
    public final /* bridge */ /* synthetic */ Object A03(Object[] objArr) {
        Object obj;
        String str;
        C47Z c47z = ((C47Z[]) objArr)[0];
        C44272JhO c44272JhO = this.A00;
        C44275JhR c44275JhR = c44272JhO.A06.A01;
        LinkedList linkedList = c44275JhR.A01;
        if (linkedList.size() >= 1) {
            SystemClock.elapsedRealtime();
            if (!linkedList.isEmpty()) {
                obj = AbstractC001800i.A0I(linkedList);
            } else {
                obj = null;
            }
            C44059Jdk c44059Jdk = (C44059Jdk) obj;
            c44059Jdk.getClass();
            int i = c44059Jdk.A02;
            int i2 = i;
            int i3 = c44059Jdk.A00;
            if (i > i3) {
                i2 = i3;
                i3 = i;
            }
            c47z.A0K = 1;
            c47z.A0H = i2;
            c47z.A0G = i3;
            ArrayList A1E = AbstractC166987dD.A1E();
            ArrayList A1E2 = AbstractC166987dD.A1E();
            Iterator it = c44275JhR.iterator();
            while (it.hasNext()) {
                C44059Jdk c44059Jdk2 = (C44059Jdk) it.next();
                if (c44059Jdk2.A05 == C05F.A01 && (str = c44059Jdk2.A07) != null) {
                    A1E.add(AbstractC166987dD.A11(str));
                    ClipInfo clipInfo = new ClipInfo();
                    clipInfo.A0F = str;
                    clipInfo.A03 = c44059Jdk2.A01;
                    long j = c44059Jdk2.A03;
                    clipInfo.A07 = 0;
                    clipInfo.A05 = (int) j;
                    clipInfo.A09 = i2;
                    clipInfo.A06 = i3;
                    A1E2.add(clipInfo);
                }
            }
            c47z.A0i(A1E2);
            String A0R = AnonymousClass001.A0R(((File) A1E.get(0)).getAbsolutePath().substring(0, r1.length() - 4), "-stitched.mp4");
            File A11 = AbstractC166987dD.A11(A0R);
            C006802i A0N = AbstractC43592JPx.A0N();
            A0N.markerStart(54722561);
            float A00 = OQG.A00(A11, A1E);
            A0N.markerAnnotate(54722561, "duration", A00);
            A0N.markerEnd(54722561, (short) 2);
            ClipInfo clipInfo2 = new ClipInfo();
            clipInfo2.A0F = A0R;
            Integer num = c44272JhO.A05.A00.A0A;
            num.getClass();
            clipInfo2.A03 = num.intValue();
            clipInfo2.A07 = 0;
            float f = A00 * 1000.0f;
            clipInfo2.A05 = (int) f;
            clipInfo2.A0A = f;
            clipInfo2.A09 = i2;
            clipInfo2.A06 = i3;
            C14360o3.A0B(clipInfo2, 0);
            c47z.A1N = clipInfo2;
            c47z.A44 = MY4.A03(A0R);
            Context context = (Context) c44272JhO.A09.get();
            if (context != null) {
                AnonymousClass841 A0Q = AbstractC43594JPz.A0Q(context);
                A0Q.End(A11.getPath());
                A0Q.Eab(c47z.A35);
                A0Q.EPt(1.0f);
            }
            SystemClock.elapsedRealtime();
        }
        return c47z;
    }

    @Override // X.U7H
    public final void A04() {
        MN4 mn4 = (MN4) this.A00.A0A.get();
        if (mn4 != null) {
            ViewOnClickListenerC44269JhH viewOnClickListenerC44269JhH = (ViewOnClickListenerC44269JhH) mn4;
            Context context = viewOnClickListenerC44269JhH.getContext();
            C6WQ c6wq = new C6WQ(context);
            viewOnClickListenerC44269JhH.A09 = c6wq;
            c6wq.A00(context.getString(2131969964));
            viewOnClickListenerC44269JhH.A09.setCancelable(false);
            viewOnClickListenerC44269JhH.postDelayed(new M00(viewOnClickListenerC44269JhH), 500L);
        }
    }

    @Override // X.U7H
    public final /* bridge */ /* synthetic */ void A05(Object obj) {
        ViewOnClickListenerC44269JhH viewOnClickListenerC44269JhH;
        C6WQ c6wq;
        C47Z c47z = (C47Z) obj;
        if (c47z.A1N == null) {
            LinkedList linkedList = this.A00.A06.A01.A01;
            AbstractC12120kG.A01("VideoCaptureController", AnonymousClass001.A0d("Null stitchedClipInfo clipStackManager.size(): ", " hasClips() ", linkedList.size(), AbstractC25226BEj.A1b(linkedList)));
        }
        C44272JhO c44272JhO = this.A00;
        MN4 mn4 = (MN4) c44272JhO.A0A.get();
        if (mn4 != null && (c6wq = (viewOnClickListenerC44269JhH = (ViewOnClickListenerC44269JhH) mn4).A09) != null) {
            c6wq.dismiss();
            viewOnClickListenerC44269JhH.A09 = null;
        }
        if (c44272JhO.A09.get() != null) {
            C40121td c40121td = c44272JhO.A08;
            C47Z c47z2 = c44272JhO.A00;
            c47z2.getClass();
            c40121td.A0D(c47z2);
        }
        if (mn4 != null) {
            ((ViewOnClickListenerC44269JhH) mn4).A05.Cs4(c47z);
        }
    }
}
