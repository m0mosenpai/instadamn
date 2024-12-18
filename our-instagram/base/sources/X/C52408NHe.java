package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.LruCache;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.NHe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52408NHe extends AbstractC51134Mid {
    public int A00;
    public int A01;
    public O26 A02;
    public AbstractC187378Sf A03;
    public InterfaceC184998Io A04;
    public List A05;
    public InterfaceC16660sJ A06;
    public InterfaceC16660sJ A07;
    public final ClipsCreationViewModel A08;
    public final C187418Sj A09;
    public final C183298Bb A0A;
    public final C2GS A0B;
    public final UserSession A0C;
    public final O25 A0D;
    public final C187358Sd A0E;

    public C52408NHe(UserSession userSession, O25 o25, ClipsCreationViewModel clipsCreationViewModel, C187418Sj c187418Sj, C187358Sd c187358Sd, C183298Bb c183298Bb) {
        C14360o3.A0B(userSession, 1);
        this.A0C = userSession;
        this.A0A = c183298Bb;
        this.A0E = c187358Sd;
        this.A08 = clipsCreationViewModel;
        this.A0D = o25;
        this.A09 = c187418Sj;
        this.A07 = C57624Pha.A00;
        this.A03 = new C187368Se(false);
        this.A05 = C16930sl.A00;
        this.A0B = MSW.A0E();
        this.A01 = -2;
    }

    public static final void A01(C52408NHe c52408NHe, int i, int i2) {
        Iterator it = C17s.A0C(i, i2 + i).iterator();
        while (it.hasNext()) {
            int A00 = ((AbstractC16880sg) it).A00();
            int i3 = (A00 * 2) + 1;
            if (A00 == c52408NHe.A01 / 2) {
                c52408NHe.notifyItemChanged(i3);
            }
        }
    }

    public final void A07(LruCache lruCache) {
        C09530e4 c09530e4;
        C52429NHz c52429NHz;
        InterfaceC115505Kk interfaceC115505Kk;
        C14360o3.A0B(lruCache, 0);
        List list = super.A03;
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : list) {
            if ((obj instanceof C52429NHz) || (obj instanceof C52427NHx)) {
                A1E.add(obj);
            }
        }
        ArrayList A0q = AbstractC167017dG.A0q(A1E);
        Iterator it = A1E.iterator();
        while (it.hasNext()) {
            AbstractC53445NkY abstractC53445NkY = (AbstractC53445NkY) it.next();
            C09530e4 c09530e42 = null;
            if (!(abstractC53445NkY instanceof C52427NHx)) {
                if ((abstractC53445NkY instanceof C52429NHz) && (c52429NHz = (C52429NHz) abstractC53445NkY) != null && (interfaceC115505Kk = c52429NHz.A00) != null) {
                    C183298Bb c183298Bb = this.A0A;
                    String str = (String) new C206899Du(c183298Bb.A00(), 49).invoke(interfaceC115505Kk);
                    int A0H = AbstractC166987dD.A0H(c183298Bb.A00().A05.invoke(interfaceC115505Kk));
                    C51683MsE c51683MsE = new C51683MsE(null, A0H, c183298Bb.A00().A02, c183298Bb.A00().A01, true);
                    for (int i = 0; i < A0H; i++) {
                        Bitmap bitmap = (Bitmap) lruCache.get(new C206369Bt(str, AbstractC166987dD.A0H(c183298Bb.A00().A07.invoke(Integer.valueOf(i), interfaceC115505Kk)), 2));
                        if (bitmap != null) {
                            c51683MsE.A00(i, bitmap);
                        }
                    }
                    c09530e4 = AbstractC166987dD.A1L(str, c51683MsE);
                } else {
                    c09530e4 = null;
                    AbstractC12120kG.A07("ThumbnailRecyclerViewAdapterV3", "video segment is null", null);
                }
                c09530e42 = c09530e4;
            }
            A0q.add(c09530e42);
        }
        C66582za A00 = AbstractC66552zX.A00(new C9U8(this.A05, A0q));
        this.A05 = A0q;
        A00.A02(new C55584OmN(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (java.lang.Integer.valueOf(r1) != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A08(X.AbstractC187378Sf r8) {
        /*
            r7 = this;
            r1 = 0
            X.C14360o3.A0B(r8, r1)
            boolean r0 = r8 instanceof X.C8TG
            r3 = 3
            r4 = 0
            if (r0 == 0) goto L38
            r7.A06(r3)
            r0 = 4
            r7.A06(r0)
            r7.A06(r1)
            X.8Sf r1 = r7.A03
            boolean r0 = r1 instanceof X.C187538Sv
            if (r0 == 0) goto L29
            X.8Sv r1 = (X.C187538Sv) r1
            if (r1 == 0) goto L29
            int r1 = r1.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L29
        L26:
            r7.notifyItemChanged(r1)
        L29:
            r7.A03 = r8
            X.2GS r0 = r7.A0B
            r0.A0B(r8)
            X.0sJ r1 = r7.A07
            X.8Sf r0 = r7.A03
            r1.invoke(r0)
            return
        L38:
            X.8Sf r6 = r7.A03
            boolean r1 = r6 instanceof X.C187508Ss
            boolean r0 = r8 instanceof X.C187508Ss
            if (r1 == r0) goto L47
            int r0 = r7.A00
            int r0 = r0 * 2
            int r1 = r0 + 1
            goto L26
        L47:
            boolean r5 = r8 instanceof X.C187538Sv
            if (r5 == 0) goto L54
            r0 = r8
            X.8Sv r0 = (X.C187538Sv) r0
            int r1 = r0.A00
            r0 = -1
            if (r1 == r0) goto L54
            goto L26
        L54:
            boolean r0 = r8 instanceof X.C187368Se
            if (r0 == 0) goto L6b
            boolean r0 = r6 instanceof X.C187368Se
            if (r0 == 0) goto L6b
            r0 = r6
            X.8Se r0 = (X.C187368Se) r0
            r2 = 1
            if (r0 == 0) goto L9c
            boolean r1 = r0.A00
            r0 = r8
            X.8Se r0 = (X.C187368Se) r0
            boolean r0 = r0.A00
            if (r1 != r0) goto L9c
        L6b:
            if (r5 == 0) goto L29
            boolean r0 = r6 instanceof X.C187538Sv
            if (r0 == 0) goto L9a
            X.8Sv r6 = (X.C187538Sv) r6
            if (r6 == 0) goto L9a
            int r1 = r6.A00
            r0 = -1
            boolean r0 = X.MSY.A1S(r1, r0)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
        L80:
            r0 = r8
            X.8Sv r0 = (X.C187538Sv) r0
            if (r0 == 0) goto L90
            int r1 = r0.A00
            r0 = -1
            boolean r0 = X.MSY.A1S(r1, r0)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
        L90:
            boolean r0 = X.C14360o3.A0K(r2, r4)
            if (r0 != 0) goto L29
            r7.A06(r3)
            goto L29
        L9a:
            r2 = r4
            goto L80
        L9c:
            r7.A06(r2)
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52408NHe.A08(X.8Sf):void");
    }

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        View view;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C187368Se c187368Se;
        int i2;
        C14360o3.A0B(c3oo, 0);
        if (c3oo instanceof C51369MmU) {
            C51369MmU c51369MmU = (C51369MmU) c3oo;
            int i3 = i / 2;
            AbstractC53445NkY abstractC53445NkY = (AbstractC53445NkY) AbstractC001800i.A0O(super.A03, i3);
            InterfaceC115505Kk interfaceC115505Kk = null;
            if (abstractC53445NkY instanceof C52429NHz) {
                InterfaceC115505Kk interfaceC115505Kk2 = ((C52429NHz) abstractC53445NkY).A00;
                if (interfaceC115505Kk2 != null) {
                    interfaceC115505Kk = interfaceC115505Kk2;
                }
                int i4 = 4;
                C51683MsE c51683MsE = null;
                if (interfaceC115505Kk == null) {
                    AbstractC12120kG.A07("ThumbnailRecyclerViewAdapterV3", "video segment is null", null);
                    return;
                }
                if (super.A01) {
                    View view2 = c51369MmU.itemView;
                    if (i3 != super.A00) {
                        i4 = 0;
                    }
                    view2.setVisibility(i4);
                }
                this.A0A.A01(interfaceC115505Kk, new C30509Dbs(i, 23, this, c51369MmU, interfaceC115505Kk));
                AbstractC187378Sf abstractC187378Sf = this.A03;
                if (abstractC187378Sf instanceof C187368Se) {
                    c187368Se = (C187368Se) abstractC187378Sf;
                } else {
                    c187368Se = null;
                }
                boolean z = true;
                if ((c187368Se == null || !c187368Se.A00) && !(abstractC187378Sf instanceof C187538Sv)) {
                    z = false;
                }
                View A06 = AbstractC31171DnF.A06(c51369MmU);
                int i5 = 0;
                if (z) {
                    i2 = (int) c51369MmU.A02;
                } else {
                    i2 = 0;
                }
                AbstractC13880nE.A0e(A06, i2);
                View A062 = AbstractC31171DnF.A06(c51369MmU);
                if (z) {
                    i5 = (int) c51369MmU.A02;
                }
                AbstractC13880nE.A0V(A062, i5);
                C09530e4 c09530e4 = (C09530e4) AbstractC001800i.A0O(this.A05, i3);
                if (c09530e4 != null) {
                    c51683MsE = (C51683MsE) c09530e4.A01;
                }
                c51369MmU.A01 = c51683MsE;
                A02(this, c51369MmU, i);
                FilmstripTimelineView filmstripTimelineView = c51369MmU.A09;
                C115475Kh c115475Kh = (C115475Kh) interfaceC115505Kk;
                float f = c115475Kh.A09 - c115475Kh.A0G.A03;
                float A00 = AbstractC54865OOa.A00(interfaceC115505Kk);
                filmstripTimelineView.A01(f / A00, (c115475Kh.A08 - r5) / A00);
                filmstripTimelineView.setDurationSlidingAllowed(true);
                filmstripTimelineView.setShowSeekbar(false);
                filmstripTimelineView.A00 = this.A04;
                filmstripTimelineView.setTrimmerMinimumRange(100.0f / AbstractC54865OOa.A00(interfaceC115505Kk));
                ClipsCreationViewModel clipsCreationViewModel = this.A08;
                int A0E = clipsCreationViewModel.A0E() - MSW.A04(clipsCreationViewModel);
                float A002 = AbstractC54865OOa.A00(interfaceC115505Kk);
                filmstripTimelineView.setTrimmerMaximumRange(Math.max(100.0f / A002, Math.min((MSW.A05(c115475Kh) + A0E) / A002, 1.0f)));
                filmstripTimelineView.setVisibility(0);
                TextView textView = c51369MmU.A06;
                textView.setText(A00(AbstractC166997dE.A0L(textView), MSW.A05(c115475Kh)));
                c51369MmU.A01(this.A03, this.A01);
                ViewOnClickListenerC55458OkC.A01(c51369MmU.A04, this, i3, 1);
                view = c51369MmU.A03;
            } else {
                if (abstractC53445NkY instanceof C52427NHx) {
                    C51593Mql c51593Mql = ((C52427NHx) abstractC53445NkY).A00;
                    c51369MmU.itemView.setVisibility(0);
                    ViewOnClickListenerC55460OkF.A00(c51369MmU.itemView, 15, this);
                    TextView textView2 = c51369MmU.A06;
                    textView2.setText(A00(AbstractC166997dE.A0L(textView2), c51593Mql.A02));
                    textView2.setVisibility(0);
                    C183298Bb c183298Bb = this.A0A;
                    int i6 = c183298Bb.A00().A02;
                    int i7 = c183298Bb.A00().A01;
                    View view3 = c51369MmU.A03;
                    ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
                    layoutParams.width = i6;
                    layoutParams.height = i7;
                    view3.setVisibility(0);
                    ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                    } else {
                        marginLayoutParams = null;
                    }
                    Context A03 = AbstractC37301Gc2.A03(c51369MmU);
                    C14360o3.A0B(c51369MmU.A07, 1);
                    C8RA c8ra = C51369MmU.A0B;
                    if (c8ra == null) {
                        c8ra = new C24145AnU(A03, 0);
                        C51369MmU.A0B = c8ra;
                    }
                    if (marginLayoutParams != null) {
                        marginLayoutParams.setMargins(0, c8ra.Bs3(), 0, c8ra.Bs1());
                    }
                    view3.setLayoutParams(marginLayoutParams);
                    c51369MmU.A09.setVisibility(8);
                    c51369MmU.A01 = null;
                    c51369MmU.A04.setVisibility(8);
                    return;
                }
                if (abstractC53445NkY instanceof C52428NHy) {
                    C51593Mql c51593Mql2 = ((C52428NHy) abstractC53445NkY).A00;
                    c51369MmU.itemView.setVisibility(0);
                    TextView textView3 = c51369MmU.A06;
                    textView3.setText(A00(AbstractC166997dE.A0L(textView3), c51593Mql2.A02));
                    textView3.setVisibility(0);
                    C183298Bb c183298Bb2 = this.A0A;
                    int i8 = c183298Bb2.A00().A02;
                    int i9 = c183298Bb2.A00().A01;
                    View view4 = c51369MmU.A05;
                    if (view4 != null) {
                        ViewGroup.LayoutParams layoutParams3 = view4.getLayoutParams();
                        layoutParams3.width = i8;
                        layoutParams3.height = i9;
                        view4.setVisibility(0);
                    }
                    C0fQ.A00(ViewOnClickListenerC55444Ojt.A00, c51369MmU.itemView);
                    return;
                }
                AbstractC12120kG.A07("ThumbnailRecyclerViewAdapterV3", "No associated segment when binding thumbnail view holder", null);
                return;
            }
        } else if (c3oo instanceof C51206Mjr) {
            view = c3oo.itemView;
        } else {
            AbstractC12120kG.A07("ThumbnailRecyclerViewAdapterV3", "No associated holder when binding thumbnail", null);
            return;
        }
        view.setVisibility(8);
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        if (i != 1) {
            if (i != 2) {
                Context context = viewGroup.getContext();
                int A05 = (AbstractC167007dF.A0K(context).widthPixels - this.A0A.A00().A02) - (AbstractC167017dG.A05(context) * 2);
                int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C211029Uz(AbstractC25226BEj.A0R(LayoutInflater.from(context), viewGroup, R.layout.layout_transition_selector, false), this.A0C, A05);
            }
            int i3 = C3OO.FLAG_ADAPTER_FULLUPDATE;
            return new C3OO(AbstractC25226BEj.A0R(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.layout_add_clip_button_item, false));
        }
        int i4 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C51369MmU(AbstractC25226BEj.A0R(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.layout_thumbnail_v3_item, false), this.A02, new O27(Integer.valueOf(R.id.thumbnail_loading_shimmer_background)), this.A0A.A00(), false);
    }

    @Override // X.C2UU
    public final void onViewAttachedToWindow(C3OO c3oo) {
        C14360o3.A0B(c3oo, 0);
        if (!(c3oo instanceof C51369MmU) && !(c3oo instanceof NIC)) {
            if (c3oo instanceof C211029Uz) {
                this.A0B.A09(((C211029Uz) c3oo).A04);
                return;
            }
            return;
        }
        this.A07.invoke(this.A03);
    }

    @Override // X.C2UU
    public final void onViewDetachedFromWindow(C3OO c3oo) {
        C14360o3.A0B(c3oo, 0);
        if (c3oo instanceof C51369MmU) {
            this.A07.invoke(this.A03);
        } else {
            if (!(c3oo instanceof C211029Uz)) {
                return;
            }
            this.A0B.A08(((C211029Uz) c3oo).A04);
        }
    }

    @Override // X.C2UU
    public final void onViewRecycled(C3OO c3oo) {
        int absoluteAdapterPosition;
        InterfaceC115505Kk interfaceC115505Kk;
        C14360o3.A0B(c3oo, 0);
        if ((c3oo instanceof C51369MmU) && (absoluteAdapterPosition = c3oo.getAbsoluteAdapterPosition() / 2) >= 0) {
            List list = super.A03;
            if (absoluteAdapterPosition < list.size()) {
                AbstractC53445NkY abstractC53445NkY = (AbstractC53445NkY) list.get(absoluteAdapterPosition);
                if ((abstractC53445NkY instanceof C52429NHz) && (interfaceC115505Kk = ((C52429NHz) abstractC53445NkY).A00) != null) {
                    C183298Bb c183298Bb = this.A0A;
                    C115475Kh c115475Kh = (C115475Kh) interfaceC115505Kk;
                    C14360o3.A0B(c115475Kh, 0);
                    MSX.A1A(c183298Bb.A05, new C189248Zz(c115475Kh));
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00dd, code lost:
    
        if (r1.A0O().A0H.A02() == X.EnumC189158Zj.A03) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.C52408NHe r11, X.C51369MmU r12, int r13) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52408NHe.A02(X.NHe, X.MmU, int):void");
    }

    @Override // X.AbstractC51134Mid
    public final void A05(int i, int i2) {
        int i3 = i2 / 2;
        int i4 = i / 2;
        super.A05(i4, i3);
        ArrayList A0U = AbstractC001800i.A0U(this.A05);
        A0U.add(i3, A0U.remove(i4));
        this.A05 = A0U;
    }

    public static final String A00(Context context, long j) {
        String A0t = AbstractC31174DnI.A0t(context, Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j)), Long.valueOf((j % 1000) / 100), 2131955501);
        C14360o3.A07(A0t);
        return A0t;
    }

    public final void A06(int i) {
        int itemCount = getItemCount();
        for (int i2 = 0; i2 < itemCount; i2++) {
            if (getItemViewType(i2) == i) {
                try {
                    notifyItemChanged(i2);
                } catch (IllegalStateException unused) {
                }
            }
        }
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int size;
        C187368Se c187368Se;
        int A03 = C0f9.A03(-75044988);
        AbstractC187378Sf abstractC187378Sf = this.A03;
        if ((abstractC187378Sf instanceof C187368Se) && (c187368Se = (C187368Se) abstractC187378Sf) != null && !c187368Se.A00) {
            size = (super.A03.size() * 2) + 2;
        } else {
            size = (super.A03.size() * 2) + 1;
        }
        C0f9.A0A(-1151650887, A03);
        return size;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    @Override // X.C2UU, android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long getItemId(int r9) {
        /*
            r8 = this;
            r0 = 1984478892(0x7648beac, float:1.0178971E33)
            int r3 = X.C0f9.A03(r0)
            int r2 = r8.getItemCount()
            int r0 = r9 % 2
            if (r0 != 0) goto L46
            X.OTJ r7 = r8.A02
            java.lang.StringBuilder r1 = X.AbstractC166987dD.A1C()
            java.lang.String r0 = "transition_selector"
        L17:
            r1.append(r0)
            r1.append(r9)
            java.lang.String r6 = r1.toString()
        L21:
            r0 = 0
            X.C14360o3.A0B(r6, r0)
            java.util.HashMap r2 = r7.A01
            java.lang.Number r0 = X.AbstractC31171DnF.A0W(r6, r2)
            if (r0 != 0) goto L3b
            long r4 = r7.A00
            r0 = 1
            long r0 = r0 + r4
            r7.A00 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r2.put(r6, r0)
        L3b:
            long r1 = r0.longValue()
            r0 = -1357605809(0xffffffffaf14944f, float:-1.3513211E-10)
            X.C0f9.A0A(r0, r3)
            return r1
        L46:
            X.8Sf r1 = r8.A03
            boolean r0 = r1 instanceof X.C187368Se
            if (r0 == 0) goto L61
            X.8Se r1 = (X.C187368Se) r1
            if (r1 == 0) goto L61
            boolean r0 = r1.A00
            if (r0 != 0) goto L61
            int r0 = r2 + (-1)
            if (r9 != r0) goto L61
            X.OTJ r7 = r8.A02
            java.lang.StringBuilder r1 = X.AbstractC166987dD.A1C()
            java.lang.String r0 = "add_clip_button"
            goto L17
        L61:
            int r1 = r9 / 2
            java.util.List r0 = r8.A03
            java.lang.Object r1 = X.AbstractC001800i.A0O(r0, r1)
            X.NkY r1 = (X.AbstractC53445NkY) r1
            boolean r0 = r1 instanceof X.C52429NHz
            if (r0 == 0) goto L86
            X.NHz r1 = (X.C52429NHz) r1
            X.5Kk r0 = r1.A00
            X.5Kh r0 = (X.C115475Kh) r0
            X.5Km r0 = r0.A0G
            java.lang.String r0 = r0.A0F
            java.lang.String r6 = X.AnonymousClass001.A0O(r0, r9)
            r6.getClass()
        L80:
            X.OTJ r7 = r8.A02
            X.C14360o3.A0A(r6)
            goto L21
        L86:
            boolean r0 = r1 instanceof X.C52427NHx
            if (r0 == 0) goto L93
            X.NHx r1 = (X.C52427NHx) r1
            X.Mql r0 = r1.A00
            java.lang.String r6 = X.AbstractC166997dE.A0u(r0)
            goto L80
        L93:
            java.lang.String r2 = "ThumbnailRecyclerViewAdapterV3"
            java.lang.String r1 = "No associated segment with item"
            r0 = 0
            X.AbstractC12120kG.A07(r2, r1, r0)
            java.lang.String r6 = ""
            goto L80
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52408NHe.getItemId(int):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
    
        if (r0 != false) goto L9;
     */
    @Override // X.C2UU, android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int getItemViewType(int r7) {
        /*
            r6 = this;
            r0 = -2141811686(0xffffffff80568c1a, float:-7.948112E-39)
            int r5 = X.C0f9.A03(r0)
            int r4 = r6.getItemCount()
            X.8Sf r1 = r6.A03
            boolean r0 = r1 instanceof X.C187368Se
            if (r0 == 0) goto L30
            X.8Se r1 = (X.C187368Se) r1
        L13:
            r3 = 0
            r2 = 1
            if (r1 == 0) goto L1c
            boolean r0 = r1.A00
            r1 = 1
            if (r0 == 0) goto L1d
        L1c:
            r1 = 0
        L1d:
            r0 = 2
            if (r1 == 0) goto L2b
            int r4 = r4 - r2
            if (r7 != r4) goto L2b
            r3 = 2
        L24:
            r0 = 1739210707(0x67aa3fd3, float:1.6079593E24)
            X.C0f9.A0A(r0, r5)
            return r3
        L2b:
            int r7 = r7 % r0
            if (r7 == 0) goto L24
            r3 = 1
            goto L24
        L30:
            r1 = 0
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52408NHe.getItemViewType(int):int");
    }
}
