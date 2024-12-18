package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.instagram.common.session.UserSession;
import java.util.regex.Pattern;

/* loaded from: classes10.dex */
public final class Q9T extends C2UU {
    public final Context A00;
    public final C32298EKl A01;
    public final UserSession A02;
    public final EffectAttribution.License[] A03;

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        Q9d q9d = (Q9d) c3oo;
        EffectAttribution.License license = this.A03[i];
        C32298EKl c32298EKl = this.A01;
        UserSession userSession = this.A02;
        TextView textView = q9d.A03;
        textView.setText(license.mName);
        C0fQ.A00(new ViewOnClickListenerC63504SoX(2, userSession, c32298EKl, license), textView);
        LinearLayout linearLayout = q9d.A02;
        linearLayout.removeAllViews();
        for (EffectAttribution.AttributedAsset attributedAsset : license.mAttributedAssets) {
            Context context = q9d.A00;
            TextView textView2 = new TextView(context);
            textView2.setTextColor(-16777216);
            SpannableString spannableString = new SpannableString(AbstractC31174DnI.A0t(context, attributedAsset.mTitle, attributedAsset.mAuthor, 2131953234));
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(context.getColor(R.color.blue_8));
            String str = attributedAsset.mTitle;
            Pattern pattern = AbstractC13670mt.A00;
            spannableString.setSpan(foregroundColorSpan, 0, AbstractC167007dF.A0A(str), 33);
            textView2.setText(spannableString, TextView.BufferType.SPANNABLE);
            C0fQ.A00(new ViewOnClickListenerC63504SoX(3, userSession, c32298EKl, attributedAsset), textView2);
            linearLayout.addView(textView2);
        }
    }

    public Q9T(Bundle bundle, EffectAttribution effectAttribution, C32298EKl c32298EKl) {
        this.A00 = c32298EKl.requireActivity().getApplicationContext();
        this.A01 = c32298EKl;
        this.A03 = effectAttribution.mLicenses;
        this.A02 = AbstractC31171DnF.A0G(bundle);
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(246959310);
        int length = this.A03.length;
        C0f9.A0A(1162920216, A03);
        return length;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.3OO, X.Q9d] */
    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View A0A = AbstractC31172DnG.A0A(LayoutInflater.from(viewGroup.getContext()), viewGroup, R.layout.effect_licensing_item);
        Context context = this.A00;
        ?? c3oo = new C3OO(A0A);
        c3oo.A00 = context;
        c3oo.A01 = A0A;
        c3oo.A03 = AbstractC166997dE.A0T(A0A, R.id.license_title);
        c3oo.A02 = (LinearLayout) A0A.requireViewById(R.id.attributed_assets_container);
        return c3oo;
    }
}
