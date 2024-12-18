package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.direct.fragment.thread.poll.view.PollMessageOptionViewModel;
import java.util.Arrays;

/* renamed from: X.KCn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45498KCn extends AbstractC59962oe implements InterfaceC50461MPp {
    public static final String __redex_internal_original_name = "DirectPollMessageOptionVotersFragment";
    public C66362zD A00;
    public PollMessageOptionViewModel A01;
    public C44511JmH A02;
    public boolean A03;
    public boolean A04;
    public ViewGroup A05;
    public LinearLayoutManager A06;
    public RecyclerView A07;
    public boolean A08;
    public final float[] A0A = new float[8];
    public final InterfaceC09390do A09 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_poll_message_options_voters";
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00af  */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.2zJ, java.lang.Object] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r8, android.os.Bundle r9) {
        /*
            r7 = this;
            r2 = 0
            X.C14360o3.A0B(r8, r2)
            super.onViewCreated(r8, r9)
            r0 = 2131437913(0x7f0b2959, float:1.8497738E38)
            android.view.ViewGroup r0 = X.AbstractC31173DnH.A0F(r8, r0)
            r7.A05 = r0
            r0 = 2131437912(0x7f0b2958, float:1.8497736E38)
            androidx.recyclerview.widget.RecyclerView r0 = X.AbstractC31172DnG.A0G(r8, r0)
            r7.A07 = r0
            android.content.Context r0 = r7.requireContext()
            r4 = 1
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            r1.<init>(r0, r4, r2)
            r7.A06 = r1
            androidx.recyclerview.widget.RecyclerView r0 = r7.A07
            if (r0 == 0) goto L2c
            r0.setLayoutManager(r1)
        L2c:
            X.2zG r1 = X.AbstractC31174DnI.A0R(r7)
            X.KHV r0 = new X.KHV
            r0.<init>(r7)
            r1.A01(r0)
            X.KHE r0 = new X.KHE
            r0.<init>()
            X.2zD r2 = X.AbstractC31173DnH.A0R(r1, r0)
            r7.A00 = r2
            boolean r0 = r7.A08
            java.lang.String r6 = "adapter"
            java.lang.String r5 = "optionViewModel"
            if (r0 == 0) goto Lbc
            X.JmH r0 = r7.A02
            if (r0 == 0) goto Lcd
            X.2GT r3 = r0.A00
            X.07X r2 = r7.getViewLifecycleOwner()
            r0 = 16
            X.MLl r1 = new X.MLl
            r1.<init>(r7, r0)
            r0 = 36
            X.AbstractC43593JPy.A1E(r2, r3, r1, r0)
            androidx.recyclerview.widget.RecyclerView r3 = r7.A07
            if (r3 == 0) goto L72
            r0 = 7
            X.JY9 r2 = new X.JY9
            r2.<init>(r7, r0)
            X.6ui r1 = X.C153146ui.A0A
            X.3Fe r0 = r3.A0D
            X.AbstractC37304Gc5.A0y(r0, r3, r2, r1)
        L72:
            X.JmH r3 = r7.A02
            if (r3 == 0) goto Lcd
            com.instagram.direct.fragment.thread.poll.view.PollMessageOptionViewModel r0 = r7.A01
            if (r0 == 0) goto Lcf
            java.lang.String r2 = r0.A03
            long r0 = r0.A01
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3.A00(r4, r2, r0)
        L85:
            androidx.recyclerview.widget.RecyclerView r1 = r7.A07
            if (r1 == 0) goto L98
            X.2zD r0 = r7.A00
            if (r0 != 0) goto L95
            X.C14360o3.A0F(r6)
        L90:
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L95:
            r1.setAdapter(r0)
        L98:
            r0 = 2131437899(0x7f0b294b, float:1.849771E38)
            android.view.View r1 = X.AbstractC166997dE.A0S(r8, r0)
            r0 = 41
            X.ViewOnClickListenerC48072LPx.A01(r1, r0, r7)
            r0 = 2131437911(0x7f0b2957, float:1.8497734E38)
            android.widget.TextView r1 = X.AbstractC167007dF.A0N(r8, r0)
            com.instagram.direct.fragment.thread.poll.view.PollMessageOptionViewModel r0 = r7.A01
            if (r0 == 0) goto Lcf
            java.lang.String r0 = r0.A04
            r1.setText(r0)
            java.lang.CharSequence r0 = r1.getContentDescription()
            r1.setContentDescription(r0)
            return
        Lbc:
            com.instagram.common.recyclerview.ViewModelListUpdate r1 = X.AbstractC31171DnF.A0E()
            com.instagram.direct.fragment.thread.poll.view.PollMessageOptionViewModel r0 = r7.A01
            if (r0 == 0) goto Lcf
            java.util.List r0 = r0.A05
            r1.A01(r0)
            r2.A05(r1)
            goto L85
        Lcd:
            java.lang.String r5 = "directPollMessageOptionVotersViewModel"
        Lcf:
            X.C14360o3.A0F(r5)
            goto L90
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45498KCn.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A09);
    }

    @Override // X.InterfaceC50461MPp
    public final boolean isScrolledToTop() {
        LinearLayoutManager linearLayoutManager = this.A06;
        if (linearLayoutManager == null) {
            C14360o3.A0F("linearLayoutManager");
            throw C00O.createAndThrow();
        }
        return AbstractC110854yx.A03(linearLayoutManager);
    }

    @Override // X.InterfaceC50461MPp
    public final void onBottomSheetPositionChanged(int i, int i2) {
        ViewGroup viewGroup = this.A05;
        if (viewGroup != null) {
            float A00 = JQ0.A00(i / 0.0f);
            float[] fArr = this.A0A;
            Arrays.fill(fArr, 0, 4, 0.0f * A00);
            Drawable background = viewGroup.getBackground();
            C14360o3.A0C(background, AbstractC111324zv.A00(27));
            ((GradientDrawable) background).setCornerRadii(fArr);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(2067947723);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        PollMessageOptionViewModel pollMessageOptionViewModel = (PollMessageOptionViewModel) requireArguments.getParcelable("DirectPollMessageVotersFragment_OPTION_VIEW_MODEL");
        if (pollMessageOptionViewModel != null) {
            this.A01 = pollMessageOptionViewModel;
            this.A08 = requireArguments.getBoolean("DirectPollMessageVotersFragment_ARGS_IS_BROADCAST_CHAT_THREAD");
            this.A02 = (C44511JmH) new C52942bb(new C45570KFk(AbstractC166987dD.A0r(this.A09)), this).A00(C44511JmH.class);
            C0f9.A09(1715116458, A02);
            return;
        }
        IllegalArgumentException A12 = AbstractC166987dD.A12("voters info can't be null");
        C0f9.A09(-288534519, A02);
        throw A12;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(183524056);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_direct_poll_message_option_voters, viewGroup, false);
        C0f9.A09(-594591923, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1331850425);
        super.onDestroyView();
        this.A05 = null;
        this.A07 = null;
        C0f9.A09(-1058104273, A02);
    }
}
