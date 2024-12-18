package X;

import android.os.Bundle;
import android.os.Parcelable;
import com.instagram.nux.cal.model.ConnectContent;
import com.instagram.nux.cal.model.FXCalAgeInfo;
import com.instagram.nux.cal.model.FXCalAgeRestrictionScreenContent;
import java.io.Serializable;

/* loaded from: classes6.dex */
public final class EI3 extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "AgeMismatchFragment";
    public AbstractC18680vv A00;
    public EnumC33360Eot A01;
    public ConnectContent A02;
    public FXCalAgeInfo A03;
    public FXCalAgeInfo A04;
    public FXCalAgeRestrictionScreenContent A05;
    public Integer A06;
    public String A07;
    public String A08;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "age_mismatch";
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A00;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-2126972393);
        super.onCreate(bundle);
        requireArguments();
        this.A00 = AbstractC31176DnK.A0R(this);
        Parcelable parcelable = requireArguments().getParcelable("argument_content");
        parcelable.getClass();
        this.A02 = (ConnectContent) parcelable;
        this.A06 = AbstractC34254F9a.A00(AbstractC31173DnH.A0j(requireArguments(), "argument_flow"));
        Serializable serializable = requireArguments().getSerializable("argument_entry_point");
        serializable.getClass();
        this.A01 = (EnumC33360Eot) serializable;
        FXCalAgeRestrictionScreenContent fXCalAgeRestrictionScreenContent = this.A02.A01;
        fXCalAgeRestrictionScreenContent.getClass();
        this.A05 = fXCalAgeRestrictionScreenContent;
        this.A07 = null;
        this.A08 = null;
        FXCalAgeInfo fXCalAgeInfo = fXCalAgeRestrictionScreenContent.A00;
        fXCalAgeInfo.getClass();
        FXCalAgeInfo fXCalAgeInfo2 = this.A05.A01;
        fXCalAgeInfo2.getClass();
        if (fXCalAgeInfo.A00 > fXCalAgeInfo2.A00) {
            this.A04 = fXCalAgeInfo2;
            this.A03 = fXCalAgeInfo;
        } else {
            this.A04 = fXCalAgeInfo;
            this.A03 = fXCalAgeInfo2;
        }
        C0f9.A09(956589729, A02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0101, code lost:
    
        if (r1 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0113, code lost:
    
        if (r1 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x011a, code lost:
    
        if (X.AbstractC31174DnI.A1b(r0) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0153, code lost:
    
        if (r1 == false) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0145  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r11, android.view.ViewGroup r12, android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EI3.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
