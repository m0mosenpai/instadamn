package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.text.TextPaint;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.button.IgdsButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Dta, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31550Dta {
    public static final void A00(Context context, UserSession userSession, C53N c53n, C31549DtZ c31549DtZ, List list, boolean z) {
        C31551Dtb c31551Dtb;
        int titleRes;
        Context context2;
        int i;
        Resources resources;
        C14360o3.A0B(context, 0);
        AbstractC25233BEq.A0w(1, userSession, c31549DtZ, list);
        C14360o3.A0B(c53n, 6);
        int size = list.size();
        ImmutableList immutableList = c31549DtZ.A00;
        if (immutableList == null || immutableList.size() != size) {
            ViewGroup viewGroup = c31549DtZ.A01;
            viewGroup.removeAllViews();
            ImmutableList.Builder builder = new ImmutableList.Builder();
            for (int i2 = 0; i2 < size; i2++) {
                C31551Dtb c31551Dtb2 = new C31551Dtb(c31549DtZ.itemView.getContext(), c31549DtZ.A02);
                builder.add((Object) c31551Dtb2);
                viewGroup.addView(c31551Dtb2);
            }
            c31549DtZ.A00 = builder.build();
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC37229Gae interfaceC37229Gae = (InterfaceC37229Gae) it.next();
            if (interfaceC37229Gae != null) {
                if (!interfaceC37229Gae.CRX(userSession, null)) {
                    A1E.add(interfaceC37229Gae);
                }
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            InterfaceC37229Gae interfaceC37229Gae2 = (InterfaceC37229Gae) it2.next();
            if (interfaceC37229Gae2 != null) {
                if (interfaceC37229Gae2.CRX(userSession, null)) {
                    A1E.add(interfaceC37229Gae2);
                }
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
        int size2 = A1E.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size2; i4++) {
            InterfaceC37229Gae interfaceC37229Gae3 = (InterfaceC37229Gae) A1E.get(i4);
            ImmutableList immutableList2 = c31549DtZ.A00;
            if (immutableList2 != null && (c31551Dtb = (C31551Dtb) AbstractC001800i.A0O(immutableList2, i4)) != null) {
                if (!interfaceC37229Gae3.EjK(context, userSession)) {
                    c31551Dtb.setVisibility(8);
                } else {
                    c31551Dtb.setVisibility(0);
                    ImageView imageView = c31551Dtb.A01;
                    Context context3 = c31551Dtb.getContext();
                    imageView.setImageDrawable(context3.getDrawable(interfaceC37229Gae3.BEr()));
                    TextView textView = c31551Dtb.A03;
                    if (interfaceC37229Gae3.CRX(userSession, null)) {
                        titleRes = interfaceC37229Gae3.Apy();
                    } else {
                        titleRes = interfaceC37229Gae3.getTitleRes();
                    }
                    textView.setText(titleRes);
                    int C3h = interfaceC37229Gae3.C3h();
                    TextView textView2 = c31551Dtb.A02;
                    if (C3h == 2131952174) {
                        textView2.setText(context3.getString(2131952174, Long.valueOf(C18U.A01(C06090Tz.A05, userSession, 36597042667129571L))));
                    } else {
                        textView2.setText(C3h);
                    }
                    IgdsButton igdsButton = c31551Dtb.A04;
                    igdsButton.setText(interfaceC37229Gae3.Aj9());
                    IgdsButton igdsButton2 = c31551Dtb.A05;
                    igdsButton2.setText(interfaceC37229Gae3.Apx());
                    igdsButton.setAlpha(interfaceC37229Gae3.Aiy(userSession));
                    igdsButton2.setAlpha(interfaceC37229Gae3.Aiy(userSession));
                    if (interfaceC37229Gae3.CRX(userSession, null)) {
                        igdsButton.setVisibility(8);
                        igdsButton2.setVisibility(0);
                        c31551Dtb.A00.setVisibility(0);
                        context2 = imageView.getContext();
                        i = R.attr.glyphColorPrimary;
                    } else {
                        igdsButton.setVisibility(0);
                        igdsButton2.setVisibility(8);
                        c31551Dtb.A00.setVisibility(8);
                        context2 = imageView.getContext();
                        i = R.attr.glyphColorProfileActivationCardIncomplete;
                    }
                    imageView.setImageTintList(ColorStateList.valueOf(AbstractC53242c7.A0F(context2, i)));
                    if (c31551Dtb.A06) {
                        ViewGroup.LayoutParams layoutParams = igdsButton.getLayoutParams();
                        int i5 = AbstractC31493Dsd.A00;
                        if (i5 == -1) {
                            int[] iArr = AbstractC31493Dsd.A01;
                            TextPaint paint = igdsButton.A0A.getPaint();
                            int i6 = 0;
                            int i7 = 0;
                            do {
                                int i8 = iArr[i6];
                                resources = igdsButton.getResources();
                                String string = resources.getString(i8, 0);
                                C14360o3.A07(string);
                                i7 = Math.max(i7, (int) paint.measureText(string));
                                i6++;
                            } while (i6 < 2);
                            Context context4 = igdsButton.getContext();
                            C14360o3.A07(context4);
                            i5 = Math.min(Math.max(AbstractC13880nE.A0A(context4) / 3, resources.getDimensionPixelSize(R.dimen.avatar_size_ridiculously_xxlarge)), i7);
                            AbstractC31493Dsd.A00 = i5;
                        }
                        layoutParams.width = i5 + (igdsButton.getResources().getDimensionPixelSize(R.dimen.activation_row_button_padding) * 2);
                        igdsButton.setLayoutParams(layoutParams);
                    }
                    c31551Dtb.setButtonOnClickListener(new ViewOnClickListenerC35688FpN(i3, 29, interfaceC37229Gae3, userSession));
                    int i9 = i3;
                    if (z) {
                        c31551Dtb.setDismissButtonOnClickListener(new ViewOnClickListenerC35675FpA(10, interfaceC37229Gae3, userSession, c31549DtZ, c53n, c31551Dtb));
                    }
                    c31551Dtb.setDismissButtonVisibility(z);
                    i3++;
                    C18920wW A01 = AbstractC12220kQ.A01(null, userSession);
                    InterfaceC02590Ai A00 = A01.A00(A01.A00, "ig_non_feed_activation_impression");
                    A00.AAP("card_type", interfaceC37229Gae3.BfQ());
                    A00.A9K("pos", Long.valueOf(i9));
                    A00.Cht();
                }
            }
        }
    }
}
