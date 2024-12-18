package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.watchandbrowse.ui.WatchAndBrowseMainView;

/* renamed from: X.GrJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38214GrJ implements C33R {
    public int A00 = -1;
    public IgFrameLayout A01;
    public C80193i8 A02;
    public C39447HbZ A03;
    public WatchAndBrowseMainView A04;
    public boolean A05;
    public final View A06;
    public final ViewGroup A07;
    public final Activity A08;
    public final Context A09;
    public final UserSession A0A;
    public final C38215GrK A0B;

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f5, code lost:
    
        if (X.AbstractC166987dD.A1a(r7.invoke(r6, r9, r0.A00.AiU(r10.A01, A00(), r10.A03, r10.A04))) == true) goto L32;
     */
    @Override // X.C33R
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DSJ(X.C75113Zb r11, int r12) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38214GrJ.DSJ(X.3Zb, int):void");
    }

    public final C80193i8 A00() {
        C80193i8 c80193i8 = this.A02;
        if (c80193i8 != null) {
            return c80193i8;
        }
        C14360o3.A0F("uiState");
        throw C00O.createAndThrow();
    }

    public C38214GrJ(Activity activity, Context context, ViewGroup viewGroup, UserSession userSession) {
        View view;
        this.A09 = context;
        this.A07 = viewGroup;
        this.A0A = userSession;
        this.A08 = activity;
        this.A0B = new C38215GrK(new C3Y2(activity, context, userSession));
        if (viewGroup != null) {
            view = viewGroup.findViewById(R.id.image_button);
        } else {
            view = null;
        }
        this.A06 = view;
    }
}
