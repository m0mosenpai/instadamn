package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoBottomSheetMode;

/* renamed from: X.Ojm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55437Ojm implements View.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ EffectAttribution A01;
    public final /* synthetic */ C55907Ory A02;
    public final /* synthetic */ EffectInfoBottomSheetMode A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;

    public ViewOnClickListenerC55437Ojm(Context context, EffectAttribution effectAttribution, C55907Ory c55907Ory, EffectInfoBottomSheetMode effectInfoBottomSheetMode, String str, String str2, String str3, String str4, String str5, String str6) {
        this.A02 = c55907Ory;
        this.A07 = str;
        this.A00 = context;
        this.A04 = str2;
        this.A05 = str3;
        this.A08 = str4;
        this.A01 = effectAttribution;
        this.A06 = str5;
        this.A09 = str6;
        this.A03 = effectInfoBottomSheetMode;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Activity activity;
        int A05 = C0f9.A05(-995585309);
        C55907Ory c55907Ory = this.A02;
        String str = this.A07;
        Context context = this.A00;
        String str2 = this.A04;
        String str3 = this.A05;
        String str4 = this.A08;
        EffectAttribution effectAttribution = this.A01;
        String str5 = this.A06;
        String str6 = this.A09;
        EffectInfoBottomSheetMode effectInfoBottomSheetMode = this.A03;
        Object obj = null;
        boolean z = true;
        if (AbstractC50102Ry.A00(str, AbstractC166997dE.A0r(context.getResources(), str6, 2131953133))) {
            int ordinal = effectInfoBottomSheetMode.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                    AbstractC12120kG.A01(C55907Ory.__redex_internal_original_name, "Unknown bottom sheet mode");
                } else {
                    activity = c55907Ory.A05;
                    FragmentActivity activity2 = c55907Ory.A0D.getActivity();
                    if (activity2 != null) {
                        activity2.setResult(60572);
                        activity2.finish();
                    }
                }
            } else {
                activity = c55907Ory.A05;
            }
            C55907Ory.A00(activity, c55907Ory, str4);
        } else {
            str2.getClass();
            if (AbstractC50102Ry.A00(str, context.getString(2131953153))) {
                Activity activity3 = c55907Ory.A05;
                AbstractC167017dG.A0y(activity3, C3DN.A00);
                OXk.A00(activity3, effectAttribution, c55907Ory.A0B);
            } else if (AbstractC50102Ry.A00(str, context.getResources().getString(2131953154))) {
                if (str4 != null && !"25025320".equals(str4)) {
                    z = false;
                }
                c55907Ory.A05(str2, str3, z);
            } else if (AbstractC50102Ry.A00(str, context.getResources().getString(2131953138))) {
                InterfaceC149856oe interfaceC149856oe = c55907Ory.A0E;
                if (interfaceC149856oe != null) {
                    interfaceC149856oe.EFE(str2);
                }
                UserSession userSession = c55907Ory.A0B;
                C14360o3.A0B(userSession, 0);
                AbstractC53861Nrp.A00(new C55812OqN(userSession, str2), userSession, str2);
            } else if (AbstractC50102Ry.A00(str, context.getResources().getString(2131954303))) {
                c55907Ory.A03();
            } else if (AbstractC50102Ry.A00(str, AbstractC13670mt.A06("%s %s", "AR Effect ID:", str2))) {
                OXk.A01(c55907Ory.A05, str2);
            } else if (AbstractC50102Ry.A00(str, context.getString(2131953155))) {
                OXk.A02(c55907Ory.A05, Integer.valueOf(c55907Ory.A04), str2);
            } else {
                if (AbstractC50102Ry.A00(str, context.getResources().getString(2131954754))) {
                    obj.getClass();
                    throw C00O.createAndThrow();
                }
                if (AbstractC50102Ry.A00(str, context.getString(2131953146))) {
                    c55907Ory.A04(str2, str5, str6);
                }
            }
        }
        C0f9.A0C(-417176373, A05);
    }
}
