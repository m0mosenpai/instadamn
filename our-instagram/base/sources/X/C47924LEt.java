package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.direct.ui.countertextview.CounterTextView;

/* renamed from: X.LEt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47924LEt {
    public IgTextView A00;
    public CounterTextView A01;
    public final Context A02;
    public final C46902De A03;
    public final View A04;
    public final UserSession A05;

    public C47924LEt(Context context, View view, UserSession userSession) {
        C14360o3.A0B(view, 3);
        this.A05 = userSession;
        this.A02 = context;
        this.A04 = view;
        this.A00 = AbstractC25231BEo.A0d(view, R.id.pre_subtitle_text);
        View requireViewById = view.requireViewById(R.id.counter_text);
        CounterTextView counterTextView = (CounterTextView) requireViewById;
        counterTextView.setAnimationStyle(EnumC68123VCh.A03);
        counterTextView.setAnimationDuration(1000L);
        Context context2 = counterTextView.getContext();
        counterTextView.A03 = new int[]{context2.getColor(R.color.igds_prism_lavender_05), context2.getColor(R.color.clips_spins_attribution_edit_icon_background_color), context2.getColor(R.color.igds_prism_yellow_05)};
        C14360o3.A07(requireViewById);
        this.A01 = counterTextView;
        this.A03 = (C46902De) userSession.A01(C46902De.class, new C37017GSy(userSession, 44));
    }

    public static final void A00(Context context, C47924LEt c47924LEt, String str, int i, boolean z) {
        AbstractC166987dD.A1P(context, c47924LEt.A00, 2131954238);
        CounterTextView counterTextView = c47924LEt.A01;
        Resources resources = context.getResources();
        Integer valueOf = Integer.valueOf(i);
        counterTextView.A06(i, AbstractC31175DnJ.A0W(resources, C84963qk.A04(AbstractC166997dE.A0M(context), valueOf, 1000, true, true), R.plurals.broadcast_channel_member_count_subtitle, i), z);
        c47924LEt.A03.A00.put(str, valueOf);
    }
}
