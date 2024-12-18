package X;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.people.PeopleTag;
import com.instagram.ui.widget.textview.IgAutoCompleteTextView;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ouh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56064Ouh implements InterfaceC60072op, TextWatcher {
    public View A00;
    public InterfaceC58041PoR A01;
    public OW4 A02;
    public IgAutoCompleteTextView A03;
    public final Context A04;
    public final C22P A05;
    public final AbstractC59962oe A06;
    public final UserSession A07;
    public final boolean A08;
    public final boolean A09;

    public C56064Ouh(C22P c22p, AbstractC59962oe abstractC59962oe, UserSession userSession, boolean z, boolean z2) {
        C14360o3.A0B(userSession, 1);
        this.A07 = userSession;
        this.A06 = abstractC59962oe;
        this.A05 = c22p;
        this.A09 = z;
        this.A08 = z2;
        this.A04 = abstractC59962oe.requireContext();
    }

    public final void A00(View view, IgAutoCompleteTextView igAutoCompleteTextView) {
        C14360o3.A0B(igAutoCompleteTextView, 0);
        this.A03 = igAutoCompleteTextView;
        this.A00 = view;
        igAutoCompleteTextView.addTextChangedListener(this);
        IgAutoCompleteTextView igAutoCompleteTextView2 = this.A03;
        if (igAutoCompleteTextView2 == null) {
            C14360o3.A0F("editText");
            throw C00O.createAndThrow();
        }
        igAutoCompleteTextView2.A03 = this;
        View view2 = this.A00;
        if (view2 != null) {
            this.A02 = new OW4(this.A04, view2, this.A06, this.A07, this.A01, this.A09, this.A08);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A01(User user, String str, String str2, List list, List list2) {
        int i;
        String str3;
        Boolean AkK;
        if (str2 == null || (AkK = user.A03.AkK()) == null || AkK.booleanValue()) {
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (AbstractC43594JPz.A1Z(((PeopleTag) it.next()).A07(), user)) {
                        return;
                    }
                }
            }
            if (list2 != null) {
                i = list2.size();
            } else {
                i = AbstractC167007dF.A1W(str);
            }
            if (user.A03.AkJ() != null && user.A03.CeC() != null) {
                UserSession userSession = this.A07;
                if (!OQE.A00(userSession, user) && !AbstractC55229Oez.A0G(this.A05, userSession, Boolean.valueOf(this.A09), i) && list.size() < 20) {
                    OW4 ow4 = this.A02;
                    if (ow4 == null) {
                        str3 = "mentionConversionView";
                    } else {
                        C52190N8f c52190N8f = ow4.A03;
                        boolean z = ow4.A0C;
                        c52190N8f.A06();
                        if (!z) {
                            String A0c = AbstractC31178DnM.A0c(c52190N8f.A00, user, 2131966276);
                            C14360o3.A07(A0c);
                            c52190N8f.A09(c52190N8f.A01, new C54673OCz(user, A0c, null, R.drawable.instagram_tag_up_pano_outline_24, 0), 0);
                        }
                        int i2 = 2131966274;
                        if (c52190N8f.A02) {
                            i2 = 2131966273;
                        }
                        Context context = c52190N8f.A00;
                        String A0c2 = AbstractC31178DnM.A0c(context, user, 2131966275);
                        C14360o3.A07(A0c2);
                        c52190N8f.A09(c52190N8f.A01, new C54673OCz(user, A0c2, context.getString(i2), R.drawable.instagram_collaborate_pano_outline_24, 1), 0);
                        c52190N8f.A07();
                        PopupWindow popupWindow = ow4.A02;
                        str3 = "popupWindow";
                        if (popupWindow != null) {
                            popupWindow.setContentView(ow4.A00);
                            int measuredWidth = ow4.A08.getMeasuredWidth();
                            popupWindow.setWidth(measuredWidth);
                            int i3 = measuredWidth - 2;
                            C52190N8f c52190N8f2 = ow4.A03;
                            int count = c52190N8f2.getCount();
                            int i4 = 0;
                            int i5 = 0;
                            for (int i6 = 0; i6 < count; i6++) {
                                ListView listView = ow4.A01;
                                if (listView == null) {
                                    str3 = "mentionConversionOptionsListView";
                                } else {
                                    View view = c52190N8f2.getView(i6, null, listView);
                                    C14360o3.A07(view);
                                    i5 += AbstractC50522MSa.A07(view, i3, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
                                }
                            }
                            if (!ow4.A0D) {
                                i4 = ow4.A06.getResources().getDimensionPixelSize(R.dimen.ads_disclosure_footer_top_divider_height);
                            }
                            popupWindow.setHeight(i5 + i4 + 2);
                            ow4.A04 = false;
                            ow4.A07.postDelayed(new PMH(ow4), 150L);
                            return;
                        }
                    }
                    C14360o3.A0F(str3);
                    throw C00O.createAndThrow();
                }
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        OW4 ow4 = this.A02;
        if (ow4 == null) {
            C14360o3.A0F("mentionConversionView");
            throw C00O.createAndThrow();
        }
        ow4.A01();
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        OW4 ow4 = this.A02;
        if (ow4 == null) {
            C14360o3.A0F("mentionConversionView");
            throw C00O.createAndThrow();
        }
        return ow4.A01();
    }
}
