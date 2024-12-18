package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.direct.burner.BurnerSendThreadDetailsFragment;
import com.instagram.direct.prompts.DirectPromptTypes;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.Foe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35644Foe implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Activity A02;
    public final /* synthetic */ Context A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ FRk A05;
    public final /* synthetic */ C28531Zo A06;
    public final /* synthetic */ DirectPromptTypes A07;
    public final /* synthetic */ C189478aR A08;
    public final /* synthetic */ DirectThreadKey A09;

    public ViewOnClickListenerC35644Foe(Activity activity, Context context, UserSession userSession, FRk fRk, C28531Zo c28531Zo, DirectPromptTypes directPromptTypes, C189478aR c189478aR, DirectThreadKey directThreadKey, int i, int i2) {
        this.A05 = fRk;
        this.A09 = directThreadKey;
        this.A04 = userSession;
        this.A02 = activity;
        this.A03 = context;
        this.A08 = c189478aR;
        this.A06 = c28531Zo;
        this.A01 = i;
        this.A00 = i2;
        this.A07 = directPromptTypes;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(700371693);
        FRk fRk = this.A05;
        EnumC33511Erk enumC33511Erk = EnumC33511Erk.TRY_TAPPED;
        DirectThreadKey directThreadKey = this.A09;
        fRk.A01(enumC33511Erk, directThreadKey.A00);
        UserSession userSession = this.A04;
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        AbstractC25225BEi.A1Q(A0y, false);
        A0y.A03 = 0.75f;
        A0y.A06 = AbstractC31173DnH.A03(this.A03, this.A02, R.attr.actionBarBackgroundColor);
        int[] iArr = C189448aO.A1X;
        A0y.A04(iArr[0], iArr[1], iArr[2], iArr[3]);
        C189478aR c189478aR = this.A08;
        int i = this.A01;
        int i2 = this.A00;
        DirectPromptTypes directPromptTypes = this.A07;
        C32351EMy c32351EMy = new C32351EMy();
        Bundle A0D = AbstractC31174DnI.A0D(userSession);
        A0D.putParcelable(BurnerSendThreadDetailsFragment.ARGUMENT_DIRECT_THREAD_KEY, directThreadKey);
        A0D.putInt("direct_thread_sub_type", i);
        A0D.putInt("direct_thread_audience_type", i2);
        A0D.putParcelable("direct_recurring_prompt_type", directPromptTypes);
        A0D.putParcelable("direct_edit_add_yours_params", null);
        c32351EMy.setArguments(A0D);
        c189478aR.A0F(c32351EMy, A0y);
        C0f9.A0C(-534989330, A05);
    }
}
