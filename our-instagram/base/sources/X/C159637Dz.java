package X;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7Dz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C159637Dz extends C7E0 {
    public int A00;
    public InterfaceC160517Hl A01;
    public C2EE A02;
    public C45025JwG A03;
    public List A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public Filter A09;
    public final UserSession A0A;
    public final C159547Dp A0B;
    public final C7E3 A0C;
    public final C7E2 A0D;
    public final C7E4 A0E;
    public final List A0F = new ArrayList();
    public final InterfaceC16820sZ A0G;

    public static final void A00(C159637Dz c159637Dz) {
        c159637Dz.A0E.A00(c159637Dz.A01, c159637Dz.A02, c159637Dz.A0F, c159637Dz.A05, c159637Dz.A06);
    }

    public final AbstractC160207Gg A0D(EnumC160197Gf enumC160197Gf) {
        AbstractC160207Gg abstractC160207Gg;
        AbstractC159137Bz abstractC159137Bz;
        Iterator it = this.A0E.A00.iterator();
        C14360o3.A07(it);
        while (true) {
            abstractC160207Gg = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            C14360o3.A07(next);
            InterfaceC159097Bv interfaceC159097Bv = (InterfaceC159097Bv) next;
            if ((interfaceC159097Bv instanceof AbstractC159137Bz) && (abstractC159137Bz = (AbstractC159137Bz) interfaceC159097Bv) != null && (abstractC160207Gg = abstractC159137Bz.createCommandData()) != null) {
                Integer A03 = abstractC160207Gg.A03();
                int i = enumC160197Gf.A00;
                if (A03 != null && A03.intValue() == i) {
                    break;
                }
            }
        }
        return abstractC160207Gg;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        Filter filter = this.A09;
        if (filter == null) {
            Filter filter2 = new Filter() { // from class: X.7CA
                @Override // android.widget.Filter
                public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
                    Object obj;
                    int i;
                    C45025JwG c45025JwG;
                    InterfaceC65642y0 interfaceC65642y0;
                    C14360o3.A0B(filterResults, 1);
                    C159637Dz c159637Dz = C159637Dz.this;
                    c159637Dz.A06();
                    c159637Dz.A03 = null;
                    List A02 = C15500q5.A02(filterResults.values);
                    if (A02 == null) {
                        c159637Dz.A04 = new ArrayList();
                        C159547Dp c159547Dp = c159637Dz.A0B;
                        if (c159547Dp != null) {
                            c159547Dp.A01();
                            return;
                        }
                    } else {
                        c159637Dz.A04 = A02;
                        if (c159637Dz.A08 || c159637Dz.A07) {
                            AnonymousClass016.A1A(A02, new C50261MHq(c159637Dz, 26));
                        }
                        Iterator it = A02.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj = it.next();
                                if (obj instanceof AbstractC160207Gg) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        AbstractC160207Gg abstractC160207Gg = (AbstractC160207Gg) obj;
                        if ((A02 instanceof Collection) && A02.isEmpty()) {
                            i = 0;
                        } else {
                            Iterator it2 = A02.iterator();
                            i = 0;
                            while (it2.hasNext()) {
                                if ((it2.next() instanceof AbstractC160207Gg) && (i = i + 1) < 0) {
                                    AbstractC16960so.A1T();
                                    throw C00O.createAndThrow();
                                }
                            }
                            if (i > 1) {
                                for (Object obj2 : A02) {
                                    if (obj2 instanceof AbstractC160207Gg) {
                                        AbstractC160207Gg abstractC160207Gg2 = (AbstractC160207Gg) obj2;
                                        if (abstractC160207Gg2.A02() == C7FY.A04) {
                                            c45025JwG = new C45025JwG(null, abstractC160207Gg2, i);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        if (abstractC160207Gg != null) {
                            c45025JwG = new C45025JwG(abstractC160207Gg, null, i);
                        } else {
                            c45025JwG = new C45025JwG(null, null, 0);
                        }
                        c159637Dz.A03 = c45025JwG;
                        C159547Dp c159547Dp2 = c159637Dz.A0B;
                        if (c159547Dp2 != null) {
                            UserSession userSession = c159637Dz.A0A;
                            C14360o3.A0B(userSession, 0);
                            if (C18U.A06(C06090Tz.A05, userSession, 36315773849636397L)) {
                                L9B l9b = c159547Dp2.A01;
                                if (l9b == null) {
                                    l9b = new L9B(c159547Dp2.A05, c159547Dp2.A04, c159547Dp2.A06, c159547Dp2.A07, c159547Dp2.A00, c159547Dp2.A02, c159547Dp2.A03);
                                }
                                c159547Dp2.A01 = l9b;
                                l9b.A01(c159637Dz.A04);
                                return;
                            }
                        }
                        for (Object obj3 : A02) {
                            if (obj3 instanceof C1575075i) {
                                interfaceC65642y0 = c159637Dz.A0D;
                            } else {
                                interfaceC65642y0 = c159637Dz.A0C;
                            }
                            c159637Dz.A08(interfaceC65642y0, obj3);
                        }
                    }
                    c159637Dz.A07();
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r5v0, types: [com.instagram.direct.share.ui.mediacomposer.core.MessagePartial, java.lang.Object, android.text.style.ForegroundColorSpan] */
                @Override // android.widget.Filter
                public final CharSequence convertResultToString(Object obj) {
                    String A07;
                    String str;
                    List list;
                    String[] strArr;
                    String str2;
                    C14360o3.A0B(obj, 0);
                    if (obj instanceof C1575075i) {
                        C1575075i c1575075i = (C1575075i) obj;
                        int i = C159637Dz.this.A00;
                        C14360o3.A0B(c1575075i, 0);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        int i2 = c1575075i.A00;
                        if (i2 == 0) {
                            strArr = new String[]{c1575075i.A0C};
                        } else {
                            String str3 = c1575075i.A09;
                            C11L c11l = AJr.A00;
                            List A03 = c11l.A03(str3);
                            String str4 = c1575075i.A0A;
                            if (str4 != null) {
                                list = c11l.A03(str4);
                            } else {
                                list = null;
                            }
                            ArrayList arrayList = new ArrayList();
                            arrayList.addAll(A03);
                            if (list != null) {
                                arrayList.addAll(list);
                            }
                            strArr = (String[]) arrayList.toArray(new String[0]);
                        }
                        ArrayList arrayList2 = new ArrayList();
                        int length = strArr.length;
                        for (int i3 = 0; i3 < length; i3++) {
                            if (i3 == 0) {
                                str2 = AnonymousClass001.A0D(strArr[i3], '@');
                            } else {
                                str2 = strArr[i3];
                            }
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str2);
                            if (i3 != length - 1) {
                                spannableStringBuilder2.append(' ');
                            }
                            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i);
                            spannableStringBuilder2.setSpan(foregroundColorSpan, 0, spannableStringBuilder2.length(), 33);
                            arrayList2.add(foregroundColorSpan);
                            spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                        }
                        spannableStringBuilder.setSpan(new C22928A8y(c1575075i, c1575075i.A07, c1575075i.A06, arrayList2, i2), 0, spannableStringBuilder.length(), 33);
                        str = spannableStringBuilder;
                    } else {
                        String str5 = "";
                        str = str5;
                        if (obj instanceof AbstractC160207Gg) {
                            AbstractC160207Gg abstractC160207Gg = (AbstractC160207Gg) obj;
                            if (abstractC160207Gg instanceof C7CF) {
                                A07 = ((C7CF) abstractC160207Gg).A04;
                            } else {
                                if (abstractC160207Gg instanceof C7CG) {
                                    C7CG c7cg = (C7CG) abstractC160207Gg;
                                    if (c7cg.A04 != null) {
                                        A07 = c7cg.A07();
                                    }
                                }
                                str = str5;
                                if (abstractC160207Gg instanceof C45978KWo) {
                                    str = ((C45978KWo) abstractC160207Gg).A00;
                                }
                            }
                            int i4 = C159637Dz.this.A00;
                            C14360o3.A0B(abstractC160207Gg, 0);
                            C14360o3.A0B(A07, 1);
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(A07);
                            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                            ?? foregroundColorSpan2 = new ForegroundColorSpan(i4);
                            A7L a7l = new A7L(abstractC160207Gg, AbstractC16960so.A1N(foregroundColorSpan2));
                            int length2 = A07.length();
                            spannableStringBuilder3.setSpan(foregroundColorSpan2, 0, length2, 33);
                            spannableStringBuilder4.append((CharSequence) spannableStringBuilder3);
                            spannableStringBuilder4.setSpan(a7l, 0, length2, 33);
                            str = spannableStringBuilder4;
                        }
                    }
                    return str;
                }

                @Override // android.widget.Filter
                public final Filter.FilterResults performFiltering(CharSequence charSequence) {
                    Filter.FilterResults filterResults = new Filter.FilterResults();
                    if (!AbstractC13670mt.A0B(charSequence)) {
                        C7E4 c7e4 = C159637Dz.this.A0E;
                        String valueOf = String.valueOf(charSequence);
                        C14360o3.A0B(valueOf, 0);
                        ArrayList arrayList = new ArrayList();
                        Iterator it = c7e4.A00.iterator();
                        C14360o3.A07(it);
                        while (it.hasNext()) {
                            Object next = it.next();
                            C14360o3.A07(next);
                            ArrayList arrayList2 = (ArrayList) ((InterfaceC159097Bv) next).filter(valueOf);
                            if (arrayList2 != null) {
                                arrayList.addAll(arrayList2);
                            }
                        }
                        filterResults.count = arrayList.size();
                        filterResults.values = arrayList;
                    }
                    return filterResults;
                }
            };
            this.A09 = filter2;
            return filter2;
        }
        return filter;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.7E3, X.2y0] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.7E2, X.2y0] */
    public C159637Dz(final Activity activity, final InterfaceC11380iw interfaceC11380iw, UserSession userSession, C159627Dy c159627Dy, C159547Dp c159547Dp, InterfaceC16820sZ interfaceC16820sZ) {
        this.A0A = userSession;
        this.A0B = c159547Dp;
        this.A0G = interfaceC16820sZ;
        ?? r2 = new AbstractC65632xz(activity, interfaceC11380iw) { // from class: X.7E2
            public final Context A00;
            public final InterfaceC11380iw A01;

            @Override // X.InterfaceC65642y0
            public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
                C14360o3.A0B(anonymousClass306, 0);
                anonymousClass306.A7a(0);
            }

            @Override // X.InterfaceC65642y0
            public final int getViewTypeCount() {
                return 1;
            }

            {
                this.A00 = activity;
                this.A01 = interfaceC11380iw;
            }

            @Override // X.InterfaceC65642y0
            public final void bindView(int i, View view, Object obj, Object obj2) {
                int A03 = C0f9.A03(519982683);
                C14360o3.A0B(view, 1);
                C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.share.ui.mediacomposer.commands.core.MentionedUserData");
                C1575075i c1575075i = (C1575075i) obj;
                Object tag = view.getTag();
                C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.direct.share.ui.mediacomposer.mentions.AutoCompleteMentionUserRowViewBinder.Holder");
                CRW crw = (CRW) tag;
                InterfaceC11380iw interfaceC11380iw2 = this.A01;
                C14360o3.A0B(crw, 0);
                C14360o3.A0B(c1575075i, 1);
                C14360o3.A0B(interfaceC11380iw2, 2);
                GradientSpinnerAvatarView gradientSpinnerAvatarView = crw.A02;
                gradientSpinnerAvatarView.A0F(null, interfaceC11380iw2, c1575075i.A01);
                gradientSpinnerAvatarView.setGradientSpinnerVisible(false);
                gradientSpinnerAvatarView.A0K.setScaleType(ImageView.ScaleType.FIT_CENTER);
                crw.A00.setText(c1575075i.A09);
                String str = c1575075i.A0A;
                if (str != null && str.length() != 0) {
                    TextView textView = crw.A01;
                    textView.setVisibility(0);
                    textView.setText(str);
                    C85963sQ.A0B(textView, c1575075i.A0D);
                } else {
                    TextView textView2 = crw.A01;
                    textView2.setVisibility(8);
                    C85963sQ.A0B(textView2, false);
                }
                C0f9.A0A(946340197, A03);
            }

            @Override // X.InterfaceC65642y0
            public final View createView(int i, ViewGroup viewGroup) {
                int A03 = C0f9.A03(-1835686367);
                C14360o3.A0B(viewGroup, 1);
                View A00 = AbstractC27665CIk.A00(this.A00, viewGroup);
                C0f9.A0A(-238093154, A03);
                return A00;
            }
        };
        this.A0D = r2;
        ?? r1 = new AbstractC65632xz(activity) { // from class: X.7E3
            public final Context A00;

            @Override // X.InterfaceC65642y0
            public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
                C14360o3.A0B(anonymousClass306, 0);
                anonymousClass306.A7a(0);
            }

            @Override // X.InterfaceC65642y0
            public final int getViewTypeCount() {
                return 1;
            }

            {
                this.A00 = activity;
            }

            @Override // X.InterfaceC65642y0
            public final void bindView(int i, View view, Object obj, Object obj2) {
                int i2;
                int A03 = C0f9.A03(-927433184);
                C14360o3.A0B(view, 1);
                if (view.getTag() == null) {
                    i2 = -706891885;
                } else {
                    C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.share.ui.mediacomposer.commands.core.CommandData");
                    AbstractC160207Gg abstractC160207Gg = (AbstractC160207Gg) obj;
                    Object tag = view.getTag();
                    C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.direct.share.ui.mediacomposer.mentions.AutoCompleteMentionUserRowViewBinder.Holder");
                    CRW crw = (CRW) tag;
                    C14360o3.A0B(crw, 0);
                    C14360o3.A0B(abstractC160207Gg, 1);
                    GradientSpinnerAvatarView gradientSpinnerAvatarView = crw.A02;
                    CircularImageView circularImageView = gradientSpinnerAvatarView.A0K;
                    Context context = circularImageView.getContext();
                    C14360o3.A07(context);
                    circularImageView.setImageDrawable(AbstractC85953sP.A01(context, abstractC160207Gg.A00(), AbstractC53242c7.A0H(context, R.attr.glyphColorPrimary)));
                    circularImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    gradientSpinnerAvatarView.setGradientSpinnerVisible(false);
                    crw.A00.setText(abstractC160207Gg.A05());
                    crw.A01.setText(abstractC160207Gg.A04());
                    i2 = -734270162;
                }
                C0f9.A0A(i2, A03);
            }

            @Override // X.InterfaceC65642y0
            public final View createView(int i, ViewGroup viewGroup) {
                int A03 = C0f9.A03(-470344027);
                C14360o3.A0B(viewGroup, 1);
                View A00 = AbstractC27665CIk.A00(this.A00, viewGroup);
                C0f9.A0A(-1813577787, A03);
                return A00;
            }
        };
        this.A0C = r1;
        this.A04 = new ArrayList();
        A0B(r2, r1);
        this.A00 = activity.getColor(AbstractC53242c7.A0H(activity, R.attr.igds_color_primary_button));
        this.A0E = new C7E4(activity, userSession, c159627Dy, interfaceC16820sZ);
    }
}
