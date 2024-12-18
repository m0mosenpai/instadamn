package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.api.schemas.RangeIntf;
import com.instagram.common.session.UserSession;
import com.instagram.common.textwithentities.model.TextWithEntities;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import java.text.BreakIterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public final class HFA extends AbstractC65632xz {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final ENO A03;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        String A0F;
        int A03 = C0f9.A03(836332278);
        Context context = this.A00;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        IHU ihu = (IHU) AbstractC31172DnG.A0x(view);
        IHV ihv = (IHV) obj;
        ENO eno = this.A03;
        CircularImageView circularImageView = ihu.A02;
        if (circularImageView != null) {
            circularImageView.setUrl(ihv.A01, interfaceC11380iw);
        }
        TextView textView = ihu.A01;
        if (textView != null) {
            if (TextUtils.isEmpty(ihv.A02)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(ihv.A02);
            }
        }
        TextView textView2 = ihu.A00;
        if (textView2 != null) {
            TextWithEntities textWithEntities = ihv.A00;
            if (textWithEntities != null && !TextUtils.isEmpty(textWithEntities.A02)) {
                textView2.setVisibility(0);
                TextWithEntities textWithEntities2 = ihv.A00;
                int A0F2 = AbstractC53242c7.A0F(context, R.attr.igds_color_link);
                FI6 fi6 = new FI6(eno);
                SpannableString spannableString = new SpannableString(textWithEntities2.A02);
                List<RangeIntf> list = textWithEntities2.A05;
                if (list == null) {
                    list = C16930sl.A00;
                }
                for (RangeIntf rangeIntf : list) {
                    C14360o3.A0B(rangeIntf, 0);
                    int A0K = AbstractC167017dG.A0K(rangeIntf.BYa());
                    int A0K2 = AbstractC167017dG.A0K(rangeIntf.BYa()) + AbstractC167017dG.A0K(rangeIntf.BN2());
                    if (rangeIntf.B2H() != null && rangeIntf.B2H().getUrl() != null) {
                        spannableString.setSpan(new C31752Dx5(A0F2, 0, fi6, rangeIntf), A0K, A0K2, 17);
                    }
                }
                SpannableStringBuilder A0H = AbstractC25225BEi.A0H(spannableString);
                Long l = ihv.A00.A01;
                if (l != null) {
                    long longValue = l.longValue();
                    C14360o3.A0B(context, 0);
                    long A06 = AbstractC31177DnL.A06();
                    if (TimeUnit.SECONDS.toDays(A06 - longValue) < 28) {
                        A0F = C23831Eq.A09(AbstractC166997dE.A0M(context), longValue);
                    } else {
                        A0F = C23831Eq.A0F("MMMM d", longValue, A06);
                    }
                    if (A0F != null) {
                        A0H.append((CharSequence) "\n").append((CharSequence) A0F);
                        String obj3 = A0H.toString();
                        C14360o3.A0B(obj3, 0);
                        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                        characterInstance.setText(obj3);
                        int last = characterInstance.last();
                        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(AbstractC31174DnI.A03(context));
                        String A0R = AnonymousClass001.A0R("\n", A0F);
                        C14360o3.A0B(A0R, 0);
                        BreakIterator characterInstance2 = BreakIterator.getCharacterInstance();
                        characterInstance2.setText(A0R);
                        A0H.setSpan(foregroundColorSpan, last - characterInstance2.last(), last, 33);
                    }
                }
                AbstractC31176DnK.A1G(textView2, A0H);
            } else {
                textView2.setVisibility(8);
            }
        }
        C0f9.A0A(-565719482, A03);
    }

    public HFA(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, ENO eno) {
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A03 = eno;
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(-1343353934);
        View inflate = LayoutInflater.from(this.A00).inflate(R.layout.support_inbox_event_row, (ViewGroup) null);
        inflate.setTag(new IHU(inflate));
        C0f9.A0A(-1100598393, A03);
        return inflate;
    }
}
