package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.user.model.User;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7fu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C168607fu extends C7E1 implements InterfaceC62602sz, InterfaceC169507hQ, Filterable {
    public static final C168617fv A0I = new Object();
    public InterfaceC169517hR A00;
    public Runnable A01;
    public boolean A02;
    public boolean A03;
    public Filter A04;
    public final C168727g6 A05;
    public final UserSession A06;
    public final C38321qM A07;
    public final C57382kD A08;
    public final C168687g2 A09;
    public final C168707g4 A0A;
    public final InterfaceC169517hR A0B;
    public final InterfaceC169517hR A0C;
    public final InterfaceC169517hR A0D;
    public final InterfaceC169517hR A0E;
    public final InterfaceC169517hR A0F;
    public final C168737g7 A0G;
    public final C65842yM A0H;

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0076, code lost:
    
        if (r6.CUG() != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A00(X.InterfaceC169517hR r6, boolean r7) {
        /*
            r5 = this;
            r2 = 0
            if (r7 == 0) goto L18
            boolean r0 = r6.isLoading()
            if (r0 != 0) goto Lf
            boolean r0 = r6.CUG()
            if (r0 == 0) goto L18
        Lf:
            X.2yM r0 = r5.A0H
            r5.A09(r0, r5, r2)
        L14:
            r5.A07()
            return
        L18:
            java.lang.Object r0 = r6.Bov()
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r4 = r0.iterator()
        L22:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L6a
            java.lang.Object r3 = r4.next()
            boolean r0 = r3 instanceof X.C31335Dq0
            if (r0 == 0) goto L46
            r0 = 1145(0x479, float:1.604E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            X.C14360o3.A0C(r3, r0)
            X.FJr r1 = new X.FJr
            r1.<init>()
            X.7g7 r0 = r5.A0G
        L40:
            X.2y0 r0 = (X.InterfaceC65642y0) r0
            r5.A09(r0, r3, r1)
            goto L22
        L46:
            boolean r0 = r3 instanceof com.instagram.user.model.User
            if (r0 == 0) goto L57
            r0 = 47
            java.lang.String r0 = X.AbstractC43591JPw.A00(r0)
            X.C14360o3.A0C(r3, r0)
            r1 = 0
            X.7g4 r0 = r5.A0A
            goto L40
        L57:
            r0 = 28
            boolean r0 = X.C51756Mtf.A02(r3, r0)
            if (r0 == 0) goto L22
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.comments.model.CarouselThumbnailAdapterModel"
            X.C14360o3.A0C(r3, r0)
            X.7g6 r0 = r5.A05
            r5.A08(r0, r3)
            goto L22
        L6a:
            if (r7 != 0) goto L14
            boolean r0 = r6.isLoading()
            if (r0 != 0) goto Lf
            boolean r0 = r6.CUG()
            if (r0 == 0) goto L14
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C168607fu.A00(X.7hR, boolean):void");
    }

    @Override // X.InterfaceC62602sz
    public final boolean CLJ() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x009a, code lost:
    
        if (r0 == false) goto L41;
     */
    @Override // X.InterfaceC169507hQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DcI(X.InterfaceC169517hR r7) {
        /*
            r6 = this;
            r1 = 0
            X.C14360o3.A0B(r7, r1)
            r6.A06()
            X.7hR r3 = r6.A0F
            if (r7 != r3) goto L44
            X.1qM r1 = r6.A07
            if (r1 == 0) goto L29
            X.2kD r0 = r6.A08
            boolean r0 = r0.A02(r1)
            if (r0 == 0) goto L29
            r0 = 2131969515(0x7f1345eb, float:1.9575955E38)
            X.Dq0 r2 = new X.Dq0
            r2.<init>(r0)
            X.FJr r1 = new X.FJr
            r1.<init>()
            X.7g7 r0 = r6.A0G
            r6.A09(r0, r2, r1)
        L29:
            X.7g4 r2 = r6.A0A
        L2b:
            java.lang.Object r0 = r3.Bov()
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r1 = r0.iterator()
        L35:
            boolean r0 = r1.hasNext()
            r5 = 0
            if (r0 == 0) goto L4b
            java.lang.Object r0 = r1.next()
            r6.A09(r2, r0, r5)
            goto L35
        L44:
            X.7hR r3 = r6.A0E
            if (r7 != r3) goto L56
            X.7g2 r2 = r6.A09
            goto L2b
        L4b:
            boolean r0 = r3.isLoading()
            if (r0 != 0) goto L9c
            boolean r0 = r3.CUG()
            goto L9a
        L56:
            X.7hR r0 = r6.A0C
            if (r7 != r0) goto L5f
            r0 = 1
            r6.A00(r7, r0)
            return
        L5f:
            X.7hR r0 = r6.A0B
            if (r7 != r0) goto L67
            r6.A00(r7, r1)
            return
        L67:
            X.7hR r4 = r6.A0D
            if (r7 != r4) goto La4
            java.lang.Object r0 = r4.Bov()
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r3 = r0.iterator()
        L75:
            boolean r0 = r3.hasNext()
            r5 = 0
            if (r0 == 0) goto L90
            java.lang.Object r0 = r3.next()
            X.MWo r0 = (X.C50627MWo) r0
            java.lang.Object r2 = r0.A01
            java.lang.Object r1 = r0.A00
            java.lang.Integer r0 = X.C05F.A00
            if (r2 != r0) goto L75
            X.7g2 r0 = r6.A09
            r6.A09(r0, r1, r5)
            goto L75
        L90:
            boolean r0 = r4.isLoading()
            if (r0 != 0) goto L9c
            boolean r0 = r4.CUG()
        L9a:
            if (r0 == 0) goto La1
        L9c:
            X.2yM r0 = r6.A0H
            r6.A09(r0, r6, r5)
        La1:
            r6.A07()
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C168607fu.DcI(X.7hR):void");
    }

    @Override // X.InterfaceC62602sz
    public final boolean CL7() {
        InterfaceC169517hR interfaceC169517hR = this.A00;
        if (interfaceC169517hR != null) {
            Object Bov = interfaceC169517hR.Bov();
            C14360o3.A0C(Bov, AbstractC111324zv.A00(12));
            return ((List) Bov).isEmpty();
        }
        return false;
    }

    @Override // X.InterfaceC62602sz
    public final boolean CUG() {
        InterfaceC169517hR interfaceC169517hR = this.A00;
        if (interfaceC169517hR != null && interfaceC169517hR.CUG()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC62602sz
    public final boolean CXf() {
        InterfaceC169517hR interfaceC169517hR = this.A00;
        if (interfaceC169517hR != null) {
            if (interfaceC169517hR.isLoading() || interfaceC169517hR.CUG()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC62602sz
    public final void Chd() {
        InterfaceC169517hR interfaceC169517hR = this.A00;
        if (interfaceC169517hR != null && interfaceC169517hR.CUG()) {
            interfaceC169517hR.EKu();
        }
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        Filter filter = this.A04;
        if (filter == null) {
            filter = new Filter() { // from class: X.7g8
                @Override // android.widget.Filter
                public final CharSequence convertResultToString(Object obj) {
                    StringBuilder sb;
                    String username;
                    C14360o3.A0B(obj, 0);
                    if (obj instanceof Hashtag) {
                        sb = new StringBuilder();
                        sb.append('#');
                        username = ((Hashtag) obj).getName();
                    } else if (obj instanceof User) {
                        sb = new StringBuilder();
                        sb.append('@');
                        username = ((User) obj).getUsername();
                    } else {
                        return "";
                    }
                    sb.append(username);
                    return sb.toString();
                }

                @Override // android.widget.Filter
                public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
                }

                @Override // android.widget.Filter
                public final Filter.FilterResults performFiltering(CharSequence charSequence) {
                    C11T.A02(new RunnableC24695Awb(C168607fu.this, charSequence));
                    return null;
                }
            };
        }
        if (this.A04 == null) {
            this.A04 = filter;
        }
        return filter;
    }

    @Override // X.InterfaceC62602sz
    public final boolean isLoading() {
        InterfaceC169517hR interfaceC169517hR = this.A00;
        if (interfaceC169517hR != null && interfaceC169517hR.isLoading()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.7g6, X.2y0] */
    public C168607fu(Context context, InterfaceC168087f3 interfaceC168087f3, final InterfaceC11380iw interfaceC11380iw, final UserSession userSession, C169267gz c169267gz, final C38321qM c38321qM, InterfaceC169517hR interfaceC169517hR, InterfaceC169517hR interfaceC169517hR2, InterfaceC169517hR interfaceC169517hR3, InterfaceC169517hR interfaceC169517hR4, InterfaceC169517hR interfaceC169517hR5, InterfaceC168627fw interfaceC168627fw, Runnable runnable, String str, boolean z, boolean z2, boolean z3) {
        this.A06 = userSession;
        this.A0E = interfaceC169517hR;
        this.A0F = interfaceC169517hR2;
        this.A0C = interfaceC169517hR3;
        this.A0B = interfaceC169517hR4;
        this.A0D = interfaceC169517hR5;
        this.A07 = c38321qM;
        C168687g2 c168687g2 = new C168687g2(context, interfaceC11380iw, userSession, z);
        this.A09 = c168687g2;
        C168707g4 c168707g4 = new C168707g4(context, interfaceC11380iw, userSession, c169267gz, interfaceC168627fw, str);
        this.A0A = c168707g4;
        final WeakReference weakReference = new WeakReference(interfaceC168087f3);
        ?? r3 = new AbstractC65632xz(interfaceC11380iw, userSession, c38321qM, weakReference) { // from class: X.7g6
            public final C168067f1 A00;
            public final InterfaceC11380iw A01;
            public final C38321qM A02;
            public final WeakReference A03;

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
                this.A01 = interfaceC11380iw;
                this.A02 = c38321qM;
                this.A03 = weakReference;
                this.A00 = new C168067f1(interfaceC11380iw, userSession);
            }

            @Override // X.InterfaceC65642y0
            public final void bindView(int i, View view, Object obj, Object obj2) {
                String id;
                Long l;
                int A03 = C0f9.A03(-930625694);
                C14360o3.A0B(view, 1);
                C14360o3.A0B(obj, 2);
                Object tag = view.getTag();
                C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.comments.carousel.MentionThumbnailCarouselViewBinder.Holder");
                C210839Ug c210839Ug = (C210839Ug) tag;
                C51756Mtf c51756Mtf = (C51756Mtf) obj;
                C14360o3.A0B(c210839Ug, 0);
                C14360o3.A0B(c51756Mtf, 1);
                C215229fy c215229fy = c210839Ug.A00;
                if (!C14360o3.A0K(c215229fy.A00, c51756Mtf)) {
                    c215229fy.A00 = c51756Mtf;
                    c215229fy.clear();
                    Iterator it = ((List) c51756Mtf.A00).iterator();
                    while (it.hasNext()) {
                        c215229fy.addModel(it.next(), c215229fy.A01);
                    }
                    c215229fy.notifyDataSetChangedSmart();
                }
                C38321qM c38321qM2 = this.A02;
                if (c38321qM2 != null) {
                    C168067f1 c168067f1 = this.A00;
                    java.util.Set set = c168067f1.A02;
                    if (!AbstractC001800i.A0u(set, c38321qM2.getId()) && (id = c38321qM2.getId()) != null && id.length() != 0) {
                        C18920wW c18920wW = c168067f1.A01;
                        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, AbstractC111324zv.A00(450));
                        if (A00.isSampled()) {
                            A00.AAP(PublicKeyCredentialControllerUtility.JSON_KEY_ID, c38321qM2.getId());
                            A00.AAP("m_pk", c38321qM2.getId());
                            User CDj = c38321qM2.A0C.CDj();
                            String str2 = null;
                            if (CDj != null) {
                                l = AbstractC003100w.A0k(10, CDj.getId());
                            } else {
                                l = null;
                            }
                            A00.A9K("entity_id", l);
                            User CDj2 = c38321qM2.A0C.CDj();
                            if (CDj2 != null) {
                                str2 = CDj2.getUsername();
                            }
                            A00.AAP(AbstractC111324zv.A00(2314), str2);
                            String A2u = c38321qM2.A2u();
                            if (A2u != null) {
                                A00.A9K("media_id", AbstractC003100w.A0k(10, A2u));
                                A00.A8R(c38321qM2.BRp().A00(), "media_type");
                                A00.AAP(AbstractC111324zv.A00(4896), AbstractC111324zv.A00(4069));
                                A00.AAP("canonical_nav_chain", AbstractC25041Ki.A00);
                                A00.AAP("device_aspect_ratio_category", AbstractC82663mU.A00);
                                A00.AAP("device_fold_orientation", AbstractC82673mV.A00);
                                A00.AAP("device_fold_state", AbstractC82683mW.A00);
                                A00.A7v("device_is_in_multi_window_mode", AbstractC82693mX.A00);
                                A00.Cht();
                                String id2 = c38321qM2.getId();
                                if (id2 != null) {
                                    set.add(id2);
                                } else {
                                    throw new IllegalStateException("Required value was null.");
                                }
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                    }
                }
                C0f9.A0A(477433419, A03);
            }

            @Override // X.InterfaceC65642y0
            public final View createView(int i, ViewGroup viewGroup) {
                InterfaceC168087f3 interfaceC168087f32;
                int A03 = C0f9.A03(1929961750);
                C14360o3.A0B(viewGroup, 1);
                InterfaceC11380iw interfaceC11380iw2 = this.A01;
                WeakReference weakReference2 = this.A03;
                if (weakReference2 != null) {
                    interfaceC168087f32 = (InterfaceC168087f3) weakReference2.get();
                } else {
                    interfaceC168087f32 = null;
                }
                C14360o3.A0B(interfaceC11380iw2, 1);
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_recyclerview_horizontal, viewGroup, false);
                int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                C14360o3.A0A(inflate);
                inflate.setTag(new C210839Ug(inflate, interfaceC168087f32, interfaceC11380iw2));
                C0f9.A0A(-1566356108, A03);
                return inflate;
            }
        };
        this.A05 = r3;
        C65842yM c65842yM = new C65842yM(context);
        this.A0H = c65842yM;
        C168737g7 c168737g7 = new C168737g7(context);
        this.A0G = c168737g7;
        this.A08 = new C57382kD(userSession);
        this.A02 = z2;
        this.A01 = runnable;
        this.A03 = z3;
        A0B(c168687g2, c168707g4, c65842yM, c168737g7, r3);
    }
}
