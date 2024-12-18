package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.LQq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewStubOnInflateListenerC48090LQq implements ViewStub.OnInflateListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C41181vS A03;
    public final /* synthetic */ C41551w4 A04;
    public final /* synthetic */ InterfaceC144586fe A05;
    public final /* synthetic */ C6e7 A06;
    public final /* synthetic */ String A07;

    public ViewStubOnInflateListenerC48090LQq(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4, InterfaceC144586fe interfaceC144586fe, C6e7 c6e7, String str) {
        this.A06 = c6e7;
        this.A00 = context;
        this.A07 = str;
        this.A05 = interfaceC144586fe;
        this.A04 = c41551w4;
        this.A03 = c41181vS;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
    }

    @Override // android.view.ViewStub.OnInflateListener
    public final void onInflate(ViewStub viewStub, View view) {
        this.A06.A06 = view;
        ImageView imageView = (ImageView) view;
        if (imageView != null) {
            Context context = this.A00;
            boolean A0K = C14360o3.A0K(this.A07, "story_remix_reply");
            int i = R.drawable.instagram_camera_reaction_pano_outline_24;
            if (A0K) {
                i = R.drawable.instagram_remix_reactions_pano_outline_24;
            }
            AbstractC166997dE.A19(context, imageView, i);
        }
        InterfaceC144586fe interfaceC144586fe = this.A05;
        C41551w4 c41551w4 = this.A04;
        C0fQ.A00(new LPS(this.A03, this.A02, c41551w4, interfaceC144586fe, this.A01, this.A07, 2), view);
    }
}
