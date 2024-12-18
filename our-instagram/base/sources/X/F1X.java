package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import com.facebook.R;
import com.facebook.endtoend.EndToEnd;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class F1X {
    public static final void A00(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC16820sZ interfaceC16820sZ) {
        boolean A1b = AbstractC25233BEq.A1b(context, userSession, interfaceC11380iw);
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        if (!new FFA(userSession).A00.getBoolean("meta_ai_voice_disclaimer_accepted", false) && !EndToEnd.isRunningEndToEndTest()) {
            Drawable drawable = context.getDrawable(R.drawable.meta_ai_voice_meta_ai_voice_nux_pf_image_ig);
            C35228FgL A012 = C35228FgL.A01(context, A1b);
            A012.A04(context.getString(2131966581), context.getString(2131966580), R.drawable.instagram_star_pano_outline_24);
            A012.A04(context.getString(2131966577), context.getString(2131966576), R.drawable.instagram_audio_wave_pano_outline_24);
            A012.A04(context.getString(2131966579), context.getString(2131966578), R.drawable.instagram_microphone_off_pano_outline_24);
            List A03 = A012.A03();
            if (drawable != null) {
                Object obj = new Object();
                C54844OMp c54844OMp = new C54844OMp(context);
                c54844OMp.A07 = AbstractC166997dE.A0p(context, 2131966583);
                c54844OMp.A0A = A03;
                String A0q = AbstractC166997dE.A0q(context.getResources(), 2131966456);
                String A0q2 = AbstractC166997dE.A0q(context.getResources(), 2131966455);
                SpannableStringBuilder A0H = AbstractC25225BEi.A0H(context.getResources().getString(2131966582, A0q, A0q2));
                AnonymousClass773.A04(A0H, new C31755Dx8(context, userSession, C2Fb.A0L, AbstractC111324zv.A00(2467)), A0q);
                AnonymousClass773.A04(A0H, new C31755Dx8(context, userSession, C2Fb.A0I, AbstractC111324zv.A00(218)), A0q2);
                c54844OMp.A04 = A0H;
                c54844OMp.A04(drawable);
                c54844OMp.A06 = C05F.A00;
                c54844OMp.A02(new DialogInterfaceOnClickListenerC35450Fk7(6, obj, interfaceC16820sZ, A01), AbstractC166997dE.A0p(context, 2131966575));
                c54844OMp.A02 = new DialogInterfaceOnDismissListenerC35459FkG(0, A01, obj);
                c54844OMp.A0B = A1b;
                c54844OMp.A01();
                F1U.A00(A01, new C25512BQa(A1b ? 1 : 0, 14));
                AbstractC31177DnL.A1N(new FFA(userSession).A00, "meta_ai_voice_disclaimer_accepted", A1b);
                AbstractC162267Oo.A01(userSession, A1b);
                AbstractC34047F1a.A00(userSession);
                return;
            }
            return;
        }
        interfaceC16820sZ.invoke();
    }
}
