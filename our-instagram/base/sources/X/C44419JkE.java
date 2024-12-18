package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import java.io.File;
import java.util.List;

/* renamed from: X.JkE, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44419JkE extends BaseAdapter {
    public final UserSession A00;
    public final C47320KvV A01;
    public final C47321KvW A02;
    public final List A03;

    public C44419JkE(UserSession userSession, C47320KvV c47320KvV, C47321KvW c47321KvW, List list) {
        C14360o3.A0B(userSession, 4);
        this.A03 = list;
        this.A01 = c47320KvV;
        this.A02 = c47321KvW;
        this.A00 = userSession;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        return 1;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 2);
        if (view == null) {
            view = AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.direct_channels_nux_carousel_slide);
        }
        C14360o3.A0A(view);
        AbstractC46429Kgp abstractC46429Kgp = (AbstractC46429Kgp) this.A03.get(i);
        C14360o3.A0C(abstractC46429Kgp, "null cannot be cast to non-null type com.instagram.direct.fragment.channels.nux.CarouselNuxSlideModel");
        C45818KPx c45818KPx = (C45818KPx) abstractC46429Kgp;
        TextView A0N = AbstractC167007dF.A0N(view, R.id.description);
        AbstractC31180DnO.A06(view).setText(c45818KPx.A02);
        int i2 = c45818KPx.A00;
        A0N.setText(i2);
        if (C18U.A06(C06090Tz.A05, this.A00, 36319042319162266L)) {
            C51755Mte c51755Mte = (C51755Mte) C58632mM.A00.A01((C3LX) c45818KPx.A03.A00, LSY.A00, new C48129LSe(view, this, i)).A00();
            if (c51755Mte != null) {
                A00(view, c51755Mte, this, i);
            }
        } else {
            ImageView A0D = AbstractC31176DnK.A0D(view, R.id.image);
            A0D.setImageResource(c45818KPx.A01);
            A0D.setVisibility(0);
        }
        Context context = A0N.getContext();
        String A0p = AbstractC166997dE.A0p(context, 2131958832);
        SpannableStringBuilder A07 = AbstractC31178DnM.A07(context, A0p, i2);
        AnonymousClass773.A04(A07, new C46067KaO(this, AbstractC31174DnI.A02(context)), A0p);
        AbstractC31176DnK.A1G(A0N, A07);
        if (AbstractC56862jK.A00(context)) {
            ViewOnClickListenerC48072LPx.A01(A0N, 9, this);
        }
        return view;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.A03.size();
    }

    @Override // android.widget.Adapter
    public final /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A03.get(i);
    }

    public static final void A00(View view, C51755Mte c51755Mte, C44419JkE c44419JkE, int i) {
        IgFrameLayout igFrameLayout = (IgFrameLayout) AbstractC166997dE.A0R(view, R.id.video_container);
        VideoView videoView = (VideoView) AbstractC166997dE.A0R(view, R.id.video);
        if (c51755Mte != null) {
            android.net.Uri fromFile = android.net.Uri.fromFile((File) c51755Mte.A00);
            C14360o3.A07(fromFile);
            videoView.setVideoURI(fromFile);
            videoView.requestFocus();
            if (C18U.A06(C06090Tz.A05, c44419JkE.A00, 36318033004664660L)) {
                videoView.setOnErrorListener(LN5.A00);
            }
            videoView.setOnPreparedListener(new LNC(igFrameLayout, c44419JkE, i));
        }
    }
}
