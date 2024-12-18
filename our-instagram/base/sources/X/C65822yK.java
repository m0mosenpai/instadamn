package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.2yK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65822yK extends AbstractC65632xz {
    public static String A05 = "v1";
    public C693439u A00;
    public final C63922vD A01;
    public final Context A02;
    public final UserSession A03;
    public final InterfaceC60442pS A04;

    public C65822yK(Context context, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C63922vD c63922vD) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(c63922vD, 4);
        this.A02 = context;
        this.A03 = userSession;
        this.A04 = interfaceC60442pS;
        this.A01 = c63922vD;
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final String getBinderGroupName() {
        return "FeedSurvey";
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getIdentifier(int i, Object obj, Object obj2) {
        C14360o3.A0B(obj, 1);
        return ((C42520Irz) obj).getId().hashCode();
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return Integer.MIN_VALUE;
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 5;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        Throwable illegalStateException;
        int i2;
        C63922vD c63922vD;
        int A03 = C0f9.A03(19582040);
        C14360o3.A0B(view, 1);
        C14360o3.A0B(obj, 2);
        C14360o3.A0B(obj2, 3);
        C42520Irz c42520Irz = (C42520Irz) obj;
        C42666IuN c42666IuN = (C42666IuN) obj2;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            Object tag = view.getTag();
                            if (tag != null) {
                                C41232IMx A00 = c42520Irz.A00();
                                c63922vD = this.A01;
                                AbstractC41686IdF.A02(c63922vD, (C38526Gwm) tag, A00, false);
                                C63952vG c63952vG = c63922vD.A05;
                                c63952vG.A01.A05(view, c63952vG.A02.A00(AnonymousClass001.A0G(c42520Irz.getId(), ':', i)));
                            } else {
                                illegalStateException = new IllegalStateException("Required value was null.");
                                i2 = 1705800453;
                            }
                        } else {
                            illegalStateException = new UnsupportedOperationException(AbstractC111324zv.A00(342));
                            i2 = 503124595;
                        }
                    } else {
                        C693439u c693439u = this.A00;
                        if (c693439u != null) {
                            c693439u.A01(view, this.A03, c42520Irz, c42666IuN);
                        } else {
                            illegalStateException = new IllegalStateException("Required value was null.");
                            i2 = 1111268845;
                        }
                    }
                    C0f9.A0A(i2, A03);
                    throw illegalStateException;
                }
                Context context = this.A02;
                Object tag2 = view.getTag();
                if (tag2 != null) {
                    C22851A5u c22851A5u = (C22851A5u) tag2;
                    c63922vD = this.A01;
                    C14360o3.A0B(context, 0);
                    C14360o3.A0B(c22851A5u, 1);
                    C14360o3.A0B(c42520Irz, 2);
                    C14360o3.A0B(c63922vD, 3);
                    C38650Gyr c38650Gyr = c42520Irz.A01;
                    String str = c38650Gyr.A05;
                    if (str == null) {
                        str = "";
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_secondary_text))), 0, spannableStringBuilder.length(), 0);
                    Boolean bool = c38650Gyr.A02;
                    if (bool != null && bool.booleanValue()) {
                        spannableStringBuilder.append((CharSequence) " ");
                        int length = spannableStringBuilder.length();
                        spannableStringBuilder.append((CharSequence) context.getResources().getString(2131957627));
                        spannableStringBuilder.setSpan(new C52523NLs(c42520Irz, c63922vD, AbstractC53242c7.A0F(context, R.attr.textColorBoldLink)), length, spannableStringBuilder.length(), 0);
                        c22851A5u.A00.setMovementMethod(LinkMovementMethod.getInstance());
                    }
                    c22851A5u.A00.setText(spannableStringBuilder);
                    C63952vG c63952vG2 = c63922vD.A05;
                    c63952vG2.A01.A05(view, c63952vG2.A02.A00(AnonymousClass001.A0G(c42520Irz.getId(), ':', i)));
                } else {
                    illegalStateException = new IllegalStateException("Required value was null.");
                    i2 = -1859425022;
                    C0f9.A0A(i2, A03);
                    throw illegalStateException;
                }
            } else {
                Context context2 = this.A02;
                Object tag3 = view.getTag();
                if (tag3 != null) {
                    c63922vD = this.A01;
                    AbstractC41752IeR.A02(context2, c63922vD, (C38497GwI) tag3, c42666IuN, c42520Irz.A00(), c42520Irz, false);
                    C63952vG c63952vG22 = c63922vD.A05;
                    c63952vG22.A01.A05(view, c63952vG22.A02.A00(AnonymousClass001.A0G(c42520Irz.getId(), ':', i)));
                } else {
                    illegalStateException = new IllegalStateException("Required value was null.");
                    i2 = 620764283;
                    C0f9.A0A(i2, A03);
                    throw illegalStateException;
                }
            }
        } else {
            InterfaceC60442pS interfaceC60442pS = this.A04;
            Object tag4 = view.getTag();
            if (tag4 != null) {
                A9Y a9y = (A9Y) tag4;
                c63922vD = this.A01;
                C14360o3.A0B(a9y, 1);
                C14360o3.A0B(c42520Irz, 2);
                C14360o3.A0B(c63922vD, 4);
                C38650Gyr c38650Gyr2 = c42520Irz.A01;
                User user = c38650Gyr2.A01;
                View view2 = a9y.A00;
                if (user == null) {
                    view2.setVisibility(8);
                } else {
                    view2.setVisibility(0);
                    SpannableString spannableString = new SpannableString(user.getUsername());
                    TextView textView = a9y.A03;
                    String string = textView.getResources().getString(2131954139);
                    C14360o3.A07(string);
                    spannableString.setSpan(new C52524NLt(c42520Irz, c63922vD), 0, spannableString.length(), 0);
                    textView.setText(TextUtils.concat(spannableString, " ", string));
                    textView.setMovementMethod(LinkMovementMethod.getInstance());
                    if (interfaceC60442pS != null) {
                        a9y.A04.setUrl(user.Bhu(), interfaceC60442pS);
                    }
                    C0fQ.A00(new ViewOnClickListenerC55373Oij(c42520Irz, c63922vD), a9y.A04);
                    TextView textView2 = a9y.A02;
                    String str2 = c38650Gyr2.A08;
                    if (str2 == null) {
                        str2 = "";
                    }
                    textView2.setText(str2);
                    ImageView imageView = a9y.A01;
                    imageView.setVisibility(0);
                    if (c42666IuN != null) {
                        C0fQ.A00(new WMY(c42520Irz, c63922vD, c42666IuN), imageView);
                    }
                }
                C63952vG c63952vG222 = c63922vD.A05;
                c63952vG222.A01.A05(view, c63952vG222.A02.A00(AnonymousClass001.A0G(c42520Irz.getId(), ':', i)));
            } else {
                illegalStateException = new IllegalStateException("Required value was null.");
                i2 = -1889430442;
                C0f9.A0A(i2, A03);
                throw illegalStateException;
            }
        }
        C0f9.A0A(-884097558, A03);
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        C42520Irz c42520Irz = (C42520Irz) obj;
        C42666IuN c42666IuN = (C42666IuN) obj2;
        if (c42666IuN != null && c42666IuN.Ceb()) {
            if (anonymousClass306 != null) {
                anonymousClass306.A7a(3);
                return;
            }
            return;
        }
        C63952vG c63952vG = this.A01.A05;
        if (anonymousClass306 != null) {
            anonymousClass306.A7a(0);
        }
        if (c42520Irz != null) {
            if (c42666IuN != null) {
                c63952vG.A00(c42520Irz, c42666IuN, 0);
                if (anonymousClass306 != null) {
                    anonymousClass306.A7a(4);
                }
                c63952vG.A00(c42520Irz, c42666IuN, 4);
                if (anonymousClass306 != null) {
                    anonymousClass306.A7a(1);
                }
                c63952vG.A00(c42520Irz, c42666IuN, 1);
                if (!C14360o3.A0K(A05, "v1")) {
                    return;
                }
                if (anonymousClass306 != null) {
                    anonymousClass306.A7a(2);
                }
                c63952vG.A00(c42520Irz, c42666IuN, 2);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005b, code lost:
    
        if (r0 != false) goto L20;
     */
    @Override // X.InterfaceC65642y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View createView(int r6, android.view.ViewGroup r7) {
        /*
            r5 = this;
            r0 = -45197797(0xfffffffffd4e561b, float:-1.7141753E37)
            int r3 = X.C0f9.A03(r0)
            r1 = 1
            X.C14360o3.A0B(r7, r1)
            java.lang.String r4 = X.C63922vD.A06
            X.C65822yK.A05 = r4
            if (r6 == 0) goto L49
            if (r6 == r1) goto L75
            r0 = 2
            if (r6 == r0) goto L30
            r0 = 3
            if (r6 == r0) goto L29
            r0 = 4
            if (r6 != r0) goto La7
            com.instagram.common.session.UserSession r0 = r5.A03
            android.view.View r1 = X.AbstractC41686IdF.A00(r7, r0, r4)
        L22:
            r0 = -871876397(0xffffffffcc0838d3, float:-3.5709772E7)
            X.C0f9.A0A(r0, r3)
            return r1
        L29:
            android.content.Context r0 = r5.A02
            android.view.View r1 = X.C693539v.A00(r0, r7, r4, r1)
            goto L22
        L30:
            r2 = 0
            android.content.Context r0 = r7.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            r0 = 2131629079(0x7f0e1417, float:1.8885469E38)
            android.view.View r1 = r1.inflate(r0, r7, r2)
            X.C14360o3.A0A(r1)
            X.A5u r0 = new X.A5u
            r0.<init>(r1)
            goto L9f
        L49:
            r2 = 0
            java.lang.String r0 = "v2"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L5d
            java.lang.String r0 = "v3"
            boolean r0 = r4.equals(r0)
            r1 = 2131629080(0x7f0e1418, float:1.888547E38)
            if (r0 == 0) goto L60
        L5d:
            r1 = 2131629081(0x7f0e1419, float:1.8885473E38)
        L60:
            android.content.Context r0 = r7.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            android.view.View r1 = r0.inflate(r1, r7, r2)
            X.C14360o3.A0A(r1)
            X.A9Y r0 = new X.A9Y
            r0.<init>(r1)
            goto L9f
        L75:
            java.lang.String r0 = "v2"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto La3
            java.lang.String r0 = "v3"
            boolean r0 = r4.equals(r0)
            r2 = 2131628631(0x7f0e1257, float:1.888456E38)
            if (r0 != 0) goto L8b
            r2 = 2131628629(0x7f0e1255, float:1.8884556E38)
        L8b:
            android.content.Context r0 = r7.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            r0 = 0
            android.view.View r1 = r1.inflate(r2, r7, r0)
            X.GwI r0 = new X.GwI
            r0.<init>(r1)
            r0.A01 = r4
        L9f:
            r1.setTag(r0)
            goto L22
        La3:
            r2 = 2131628630(0x7f0e1256, float:1.8884558E38)
            goto L8b
        La7:
            java.lang.String r0 = "Unhandled view type"
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r0)
            r0 = 1289948045(0x4ce30b8d, float:1.1903703E8)
            X.C0f9.A0A(r0, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65822yK.createView(int, android.view.ViewGroup):android.view.View");
    }
}
