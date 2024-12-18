package X;

import android.text.Editable;
import android.text.NoCopySpan;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import com.instagram.phonenumber.model.CountryCodeData;
import com.instagram.user.model.UpcomingEvent;
import java.util.Date;

/* renamed from: X.Oi5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55345Oi5 implements NoCopySpan, TextWatcher {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C55345Oi5(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        String str2;
        String str3;
        switch (this.A00) {
            case 0:
                AbstractC64290T7z A07 = C60742RPg.A01.A07(AbstractC64290T7z.A01("()-."));
                String str4 = "";
                if (editable == null || (str = editable.toString()) == null) {
                    str = "";
                }
                String A08 = A07.A08(str);
                C14360o3.A0A(A08);
                if (!AbstractC001900j.A0T(A08)) {
                    C51761Mtk c51761Mtk = ((NOA) this.A02).A00;
                    if (c51761Mtk != null) {
                        CountryCodeData countryCodeData = (CountryCodeData) c51761Mtk.A00;
                        if (countryCodeData == null || (str2 = countryCodeData.A00()) == null) {
                            str2 = "";
                        }
                        str4 = str2;
                    }
                    str4 = AnonymousClass001.A0R(str4, A08);
                }
                ((AbstractC50822Mcy) this.A02).A0F((LeadGenFormBaseQuestion) this.A01, str4);
                return;
            case 1:
                AbstractC52579NNz abstractC52579NNz = (AbstractC52579NNz) this.A02;
                String A0k = AbstractC31180DnO.A0k(editable);
                String str5 = "";
                if (A0k == null) {
                    A0k = "";
                }
                String A0D = abstractC52579NNz.A0D(A0k);
                if (!AbstractC001900j.A0T(A0D)) {
                    C51761Mtk c51761Mtk2 = abstractC52579NNz.A00;
                    if (c51761Mtk2 != null) {
                        CountryCodeData countryCodeData2 = (CountryCodeData) c51761Mtk2.A00;
                        if (countryCodeData2 == null || (str3 = countryCodeData2.A00()) == null) {
                            str3 = "";
                        }
                        str5 = str3;
                    }
                    str5 = AnonymousClass001.A0R(str5, A0D);
                }
                abstractC52579NNz.A0F((LeadGenFormBaseQuestion) this.A01, str5);
                return;
            case 2:
                ((AbstractC50822Mcy) this.A02).A0F((LeadGenFormBaseQuestion) this.A01, String.valueOf(editable));
                return;
            default:
                return;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String str;
        if (3 - this.A00 == 0) {
            C14360o3.A0B(charSequence, 0);
            C55009OVr c55009OVr = (C55009OVr) this.A02;
            N6R n6r = c55009OVr.A02;
            String obj = charSequence.toString();
            C14360o3.A0B(obj, 0);
            C51626MrJ c51626MrJ = n6r.A03;
            if (c51626MrJ == null) {
                str = "viewState";
            } else {
                UpcomingEvent upcomingEvent = c51626MrJ.A01;
                EnumC53233NgW enumC53233NgW = c51626MrJ.A00;
                Date date = c51626MrJ.A04;
                Date date2 = c51626MrJ.A03;
                boolean z = c51626MrJ.A05;
                boolean z2 = c51626MrJ.A06;
                AbstractC167017dG.A1P(enumC53233NgW, obj);
                n6r.A03 = new C51626MrJ(enumC53233NgW, upcomingEvent, obj, date, date2, z, z2);
                C54735OFm c54735OFm = n6r.A02;
                if (c54735OFm == null) {
                    str = "viewHolder";
                } else {
                    N6R.A00(c54735OFm.A0D, n6r);
                    C54735OFm c54735OFm2 = c55009OVr.A03;
                    View view = (View) this.A01;
                    int length = charSequence.length();
                    ImageView imageView = c54735OFm2.A07;
                    if (length == 0) {
                        imageView.setImageDrawable(null);
                        return;
                    } else {
                        AbstractC166997dE.A19(view.getContext(), imageView, R.drawable.instagram_x_pano_outline_12);
                        ViewOnClickListenerC55468OkN.A00(imageView, 21, view, c55009OVr);
                        return;
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
