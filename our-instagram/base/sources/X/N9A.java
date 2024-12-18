package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes9.dex */
public final class N9A extends AbstractC65632xz {
    public AtomicBoolean A00 = new AtomicBoolean(false);
    public AtomicBoolean A01 = new AtomicBoolean(false);
    public final Context A02;
    public final UserSession A03;
    public final IngestSessionShim A04;
    public final P28 A05;
    public final C54530O7h A06;
    public final InterfaceC58010Pnu A07;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public N9A(Context context, UserSession userSession, IngestSessionShim ingestSessionShim, P28 p28, C54530O7h c54530O7h, InterfaceC58010Pnu interfaceC58010Pnu) {
        this.A02 = context;
        this.A03 = userSession;
        this.A05 = p28;
        this.A07 = interfaceC58010Pnu;
        this.A04 = ingestSessionShim;
        this.A06 = c54530O7h;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(-1319296891);
        InterfaceC58010Pnu interfaceC58010Pnu = this.A07;
        C35168FfK AXK = interfaceC58010Pnu.AXK();
        C51690MsL c51690MsL = C51690MsL.A09;
        if (AXK.A01(c51690MsL).A01 == C34942FaS.A03.A01) {
            this.A01.getAndSet(true);
        }
        C54640OBp c54640OBp = (C54640OBp) AbstractC31172DnG.A0x(view);
        P21 p21 = new P21(this.A02, this.A03, this.A04, this.A05, this.A06, interfaceC58010Pnu);
        c54640OBp.A02.setText(2131960272);
        c54640OBp.A03.A03(interfaceC58010Pnu.AXK().A01(c51690MsL), p21);
        C0f9.A0A(-2019609349, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(1957839296);
        UserSession userSession = this.A03;
        Context context = viewGroup.getContext();
        View inflate = LayoutInflater.from(context).inflate(R.layout.recipient_picker_add_to_fb_dating_story, viewGroup, false);
        C54640OBp c54640OBp = new C54640OBp(inflate, userSession);
        ImageView imageView = c54640OBp.A01;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        Resources resources = viewGroup.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        layoutParams.width = dimensionPixelSize;
        layoutParams.height = dimensionPixelSize;
        imageView.setLayoutParams(layoutParams);
        TextView textView = c54640OBp.A02;
        textView.setTextSize(0, AbstractC166987dD.A04(resources, R.dimen.abc_text_size_menu_header_material));
        textView.setTypeface(AbstractC167017dG.A0R(context));
        inflate.setTag(c54640OBp);
        ViewTreeObserverOnGlobalLayoutListenerC55502Okv.A00(inflate.getViewTreeObserver(), this, inflate, 6);
        C0f9.A0A(5528663, A03);
        return inflate;
    }
}
