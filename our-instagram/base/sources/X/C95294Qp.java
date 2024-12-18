package X;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4Qp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C95294Qp {
    public static final Handler A0D = new Handler(Looper.getMainLooper());
    public View A00;
    public C95304Qq A01;
    public String A02;
    public List A03;
    public final long A04;
    public final C95314Qr A05;
    public final Runnable A06;
    public final ArrayList A07;
    public final Context A08;
    public final Rect A09;
    public final Rect A0A;
    public final boolean A0B;
    public final boolean A0C;

    public C95294Qp(Context context, UserSession userSession) {
        C14360o3.A0B(context, 1);
        this.A08 = context;
        this.A00 = null;
        boolean z = false;
        this.A0A = new Rect(0, 0, 0, 0);
        this.A09 = new Rect(0, 0, 0, 0);
        this.A07 = new ArrayList();
        this.A01 = new C95304Qq(-2);
        this.A03 = C16930sl.A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        long A01 = C18U.A01(c06090Tz, userSession, 36593572334077306L);
        if (A01 > 0 && C18U.A06(c06090Tz, userSession, 36312097357300627L)) {
            z = true;
        }
        this.A0C = C18U.A06(c06090Tz, userSession, 36312097358021533L);
        this.A05 = new C95314Qr(userSession, new WeakReference(context));
        this.A04 = z ? A01 : 200L;
        this.A0B = C18U.A06(c06090Tz, userSession, 36312097357104017L);
        this.A06 = new Runnable() { // from class: X.4Qs
            @Override // java.lang.Runnable
            public final void run() {
                C95294Qp c95294Qp = C95294Qp.this;
                long j = c95294Qp.A04;
                if (j >= 0) {
                    c95294Qp.A00();
                    C95294Qp.A0D.postDelayed(this, j);
                }
            }
        };
    }

    public final void A01(ViewGroup viewGroup, C4QZ c4qz) {
        C14360o3.A0B(viewGroup, 0);
        if (this.A0C && this.A07.contains(c4qz)) {
            this.A00 = viewGroup;
            A02(c4qz);
        } else {
            this.A07.add(c4qz);
            A0D.post(this.A06);
            this.A05.A00(viewGroup, AnonymousClass001.A03(this.A01.A00, " %"));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055 A[LOOP:1: B:20:0x004f->B:22:0x0055, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00() {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95294Qp.A00():void");
    }

    public final void A02(C4QZ c4qz) {
        ViewGroup viewGroup;
        Handler handler = A0D;
        Runnable runnable = this.A06;
        handler.removeCallbacks(runnable);
        ArrayList arrayList = this.A07;
        if (!arrayList.contains(c4qz)) {
            arrayList.add(c4qz);
        }
        A00();
        handler.postDelayed(runnable, this.A04);
        View view = this.A00;
        ViewParent viewParent = null;
        if (view != null) {
            viewParent = view.getParent();
        }
        if ((viewParent instanceof ViewGroup) && (viewGroup = (ViewGroup) viewParent) != null) {
            this.A05.A00(viewGroup, AnonymousClass001.A03(this.A01.A00, " %"));
        }
    }
}
