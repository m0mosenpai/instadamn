package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.instagram.release.buildinfo.BuildInfoStore;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

/* renamed from: X.C2d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27278C2d extends AbstractC33235ElU implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "BuildInfoFragment";
    public C97T A00;
    public BuildInfoStore A01;
    public final C35119FeM A04 = new C35119FeM(true);
    public final SimpleDateFormat A05 = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.US);
    public final String A02 = "https://fburl.com/w6e3v6dq";
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);

    public static GHY A01(Context context, C27278C2d c27278C2d, String str, int i) {
        return new GHY(context, (View.OnClickListener) null, c27278C2d.A00(str, i));
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131954378);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "appversion";
    }

    @Override // X.AbstractC33235ElU, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String format;
        GHY A01;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        String obj = EnumC12920le.A02.A00().toString();
        String A04 = AbstractC12880la.A04(requireContext());
        String A02 = AbstractC12880la.A02(requireContext());
        String valueOf = String.valueOf(AbstractC12880la.A00());
        String valueOf2 = String.valueOf(requireContext().getApplicationInfo().targetSdkVersion);
        SimpleDateFormat simpleDateFormat = this.A05;
        String format2 = simpleDateFormat.format(new Date(AbstractC12880la.A01(requireContext())));
        C31335Dq0 c31335Dq0 = new C31335Dq0(2131954376);
        GHY ghy = new GHY(requireContext(), (View.OnClickListener) null, A00(A04, 2131954392));
        GHY A012 = A01(requireContext(), this, obj, 2131954379);
        GHY A013 = A01(requireContext(), this, A02, 2131954375);
        GHY A014 = A01(requireContext(), this, valueOf, 2131954377);
        Context requireContext = requireContext();
        C14360o3.A0A(format2);
        ArrayList A1N = AbstractC16960so.A1N(c31335Dq0, ghy, A012, A013, A014, A01(requireContext, this, format2, 2131954380), A01(requireContext(), this, valueOf2, 2131954389));
        if (C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(this.A03), 36316705856754294L)) {
            ArrayList A1N2 = AbstractC16960so.A1N(this.A04, new C31335Dq0(2131954387));
            BuildInfoStore buildInfoStore = this.A01;
            String str = "buildInfoStore";
            if (buildInfoStore != null) {
                C9CA c9ca = buildInfoStore.A01;
                if (c9ca.A01 != 0 && buildInfoStore.A00 >= System.currentTimeMillis() - 3600000) {
                    GHY A015 = A01(requireContext(), this, c9ca.A04, 2131954392);
                    GHY A016 = A01(requireContext(), this, String.valueOf(c9ca.A01), 2131954377);
                    Context requireContext2 = requireContext();
                    String format3 = simpleDateFormat.format(new Date(c9ca.A02 * 1000));
                    C14360o3.A07(format3);
                    A1N2.addAll(AbstractC16960so.A1Q(A015, A016, A01(requireContext2, this, format3, 2131954380)));
                    C97T c97t = this.A00;
                    if (c97t == null) {
                        str = "buildUpdater";
                    } else if (c97t.A00 < c97t.A02.A01.A01) {
                        A01 = new GHY(requireContext(), ViewOnClickListenerC28666ClE.A00(this, 21), 2131954382);
                        A1N2.addAll(AbstractC166987dD.A1J(A01));
                    }
                } else {
                    buildInfoStore.A01();
                    BuildInfoStore buildInfoStore2 = this.A01;
                    if (buildInfoStore2 != null) {
                        long j = buildInfoStore2.A00;
                        if (j == 0) {
                            format = "Never";
                        } else {
                            format = simpleDateFormat.format(new Date(j));
                        }
                        Context requireContext3 = requireContext();
                        C14360o3.A0A(format);
                        A01 = A01(requireContext3, this, format, 2131954386);
                        A1N2.addAll(AbstractC166987dD.A1J(A01));
                    }
                }
                A1N.addAll(A1N2);
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        C35119FeM c35119FeM = this.A04;
        A1N.addAll(AbstractC16960so.A1Q(c35119FeM, new C31335Dq0(2131954390), new GHY(requireContext(), ViewOnClickListenerC28666ClE.A00(this, 25), 2131954391), new GHY(requireContext(), ViewOnClickListenerC28666ClE.A00(this, 26), 2131954388)));
        A1N.addAll(AbstractC16960so.A1Q(c35119FeM, new C31335Dq0(2131954381), new GHY(requireContext(), ViewOnClickListenerC28666ClE.A00(this, 22), 2131954384), new GHY(requireContext(), ViewOnClickListenerC28666ClE.A00(this, 23), 2131954385), new GHY(requireContext(), ViewOnClickListenerC28666ClE.A00(this, 24), 2131954383)));
        setItems(A1N);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    private final SpannableString A00(String str, int i) {
        String A0p = AbstractC166997dE.A0p(requireContext(), i);
        String A0g = AnonymousClass001.A0g(A0p, ": ", str);
        SpannableString spannableString = new SpannableString(A0g);
        spannableString.setSpan(new ForegroundColorSpan(requireContext().getColor(AbstractC53242c7.A09(getContext()))), A0p.length() + 2, AbstractC167007dF.A0A(A0g), 34);
        return spannableString;
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1159444912);
        super.onCreate(bundle);
        InterfaceC09390do interfaceC09390do = this.A03;
        this.A01 = C97E.A00(AbstractC166987dD.A0r(interfaceC09390do));
        this.A00 = C97S.A00(AbstractC166987dD.A0r(interfaceC09390do));
        C0f9.A09(-2014722694, A02);
    }
}
