package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3Ah, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69473Ah {
    public Parcelable A00;
    public C1I4 A01;
    public RecyclerView A02;
    public RecyclerView A03;
    public int A04;
    public Reel A05;
    public C50F A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final InterfaceC11380iw A0A;
    public final UserSession A0B;
    public final C69523Am A0C;
    public final Context A0D;
    public final C62882tR A0E;

    /* JADX WARN: Removed duplicated region for block: B:10:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v56, types: [X.50F] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C69473Ah(android.app.Activity r16, android.content.Context r17, X.InterfaceC11380iw r18, com.instagram.common.session.UserSession r19, X.C69433Ad r20, X.InterfaceC64002vL r21) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69473Ah.<init>(android.app.Activity, android.content.Context, X.0iw, com.instagram.common.session.UserSession, X.3Ad, X.2vL):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        if (r0 == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
    
        r7.A05 = (com.instagram.model.reels.Reel) r5.Bla(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A05() {
        /*
            r7 = this;
            r0 = 0
            r7.A05 = r0
            r3 = 0
            r7.A04 = r3
            androidx.recyclerview.widget.RecyclerView r0 = r7.A03
            if (r0 == 0) goto L7c
            X.3Fe r4 = r0.A0D
            androidx.recyclerview.widget.LinearLayoutManager r4 = (androidx.recyclerview.widget.LinearLayoutManager) r4
            if (r4 == 0) goto L80
            int r2 = r4.A1a()
        L14:
            X.3Am r5 = r7.A0C
            int r0 = r5.getItemCount()
            if (r2 >= r0) goto L63
            if (r2 < 0) goto L7d
            int r0 = r5.getItemCount()
            if (r2 >= r0) goto L7d
            java.lang.Object r6 = r5.Bla(r2)
            com.instagram.model.reels.Reel r6 = (com.instagram.model.reels.Reel) r6
            if (r6 == 0) goto L7d
            X.1NB r0 = r6.A0W
            if (r0 == 0) goto L48
            X.0cb r1 = X.C17060sy.A01
            com.instagram.common.session.UserSession r0 = r7.A0B
            com.instagram.user.model.User r1 = r1.A01(r0)
            X.1NB r0 = r6.A0W
            X.C14360o3.A0A(r0)
            com.instagram.user.model.User r0 = r0.CDj()
            boolean r0 = r1.equals(r0)
            r1 = 1
            if (r0 != 0) goto L49
        L48:
            r1 = 0
        L49:
            boolean r0 = r6.A1Y
            if (r0 != 0) goto L59
            com.instagram.common.session.UserSession r0 = r7.A0B
            boolean r0 = r6.A16(r0)
            if (r0 != 0) goto L59
            boolean r0 = r6.A1V
            if (r0 == 0) goto L5b
        L59:
            if (r1 == 0) goto L7d
        L5b:
            java.lang.Object r0 = r5.Bla(r2)
            com.instagram.model.reels.Reel r0 = (com.instagram.model.reels.Reel) r0
            r7.A05 = r0
        L63:
            int r0 = r4.A1c()
            if (r2 >= r0) goto L7c
            androidx.recyclerview.widget.RecyclerView r0 = r7.A03
            X.C14360o3.A0A(r0)
            X.3OO r0 = r0.A0W(r2, r3)
            if (r0 == 0) goto L7c
            android.view.View r0 = r0.itemView
            int r0 = r0.getLeft()
            r7.A04 = r0
        L7c:
            return
        L7d:
            int r2 = r2 + 1
            goto L14
        L80:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69473Ah.A05():void");
    }

    public final void A08(C61252qn c61252qn) {
        C14360o3.A0B(c61252qn, 0);
        RecyclerView recyclerView = this.A03;
        if (recyclerView != null) {
            C1I4 c1i4 = this.A01;
            if (c1i4 == null) {
                c1i4 = new C3GI(this.A0B, c61252qn);
                this.A01 = c1i4;
            }
            recyclerView.A15(c1i4);
            if (!c61252qn.A0R.isEmpty()) {
                C1I4 c1i42 = this.A01;
                if (c1i42 == null) {
                    c1i42 = new C3GI(this.A0B, c61252qn);
                    this.A01 = c1i42;
                }
                recyclerView.A14(c1i42);
            }
        }
    }

    public final void A09(C61252qn c61252qn, boolean z) {
        LinearLayoutManager linearLayoutManager;
        int A1b;
        C14360o3.A0B(c61252qn, 0);
        RecyclerView recyclerView = this.A03;
        if (recyclerView != null) {
            C1I4 c1i4 = this.A01;
            if (c1i4 == null) {
                c1i4 = new C3GI(this.A0B, c61252qn);
                this.A01 = c1i4;
            }
            recyclerView.A15(c1i4);
            if (z) {
                if (C18U.A06(C06090Tz.A05, AbstractC25351Lp.A00(this.A0B).A00, 36317551965246828L)) {
                    int size = A02().size();
                    RecyclerView recyclerView2 = this.A03;
                    if (recyclerView2 != null && (linearLayoutManager = (LinearLayoutManager) recyclerView2.A0D) != null && (A1b = linearLayoutManager.A1b()) != -1) {
                        A07((A1b - size) + 1);
                    }
                }
            }
        }
    }

    public final C3OO A00(Reel reel) {
        RecyclerView recyclerView = this.A03;
        if (recyclerView == null || reel == null) {
            return null;
        }
        return recyclerView.A0V(this.A0C.CNP(reel));
    }

    public final Reel A01(String str) {
        C3G4 c3g4 = (C3G4) ((AbstractC69533An) this.A0C).A02.get(str);
        if (c3g4 != null) {
            return c3g4.A03;
        }
        return null;
    }

    public final List A02() {
        LinearLayoutManager linearLayoutManager;
        RecyclerView recyclerView = this.A03;
        if (recyclerView != null && (linearLayoutManager = (LinearLayoutManager) recyclerView.A0D) != null) {
            int A1b = linearLayoutManager.A1b();
            List list = ((AbstractC69533An) this.A0C).A04;
            C14360o3.A07(list);
            ArrayList arrayList = new ArrayList();
            int min = Math.min(A1b, list.size());
            for (int A1a = linearLayoutManager.A1a(); A1a < min; A1a++) {
                Object obj = list.get(A1a);
                C14360o3.A07(obj);
                Reel reel = ((C3G4) obj).A03;
                if (!reel.A0a()) {
                    arrayList.add(reel);
                }
            }
            return arrayList;
        }
        List emptyList = Collections.emptyList();
        C14360o3.A07(emptyList);
        return emptyList;
    }

    public final void A03() {
        RecyclerView recyclerView;
        final RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        RecyclerView recyclerView4;
        Context context = this.A0D;
        RecyclerView recyclerView5 = new RecyclerView(context, null);
        this.A03 = recyclerView5;
        UserSession userSession = this.A0B;
        AbstractC70633Fa.A00(context, recyclerView5, userSession);
        if (C18U.A06(C06090Tz.A05, userSession, 36322980804635439L) && (recyclerView4 = this.A03) != null) {
            recyclerView4.setItemAnimator(null);
        }
        RecyclerView recyclerView6 = this.A03;
        if (recyclerView6 != null) {
            recyclerView6.setAdapter(this.A0C);
        }
        RecyclerView recyclerView7 = this.A03;
        if (recyclerView7 != null) {
            recyclerView7.setContentDescription("reels_tray_container");
        }
        C62882tR c62882tR = this.A0E;
        if (c62882tR != null && (recyclerView3 = this.A03) != null) {
            recyclerView3.A14(c62882tR);
        }
        if (this.A09) {
            RecyclerView recyclerView8 = new RecyclerView(context, null);
            this.A02 = recyclerView8;
            AbstractC70633Fa.A00(context, recyclerView8, userSession);
            RecyclerView recyclerView9 = this.A02;
            if (recyclerView9 != null) {
                recyclerView9.setAdapter(this.A0C);
                recyclerView9.setContentDescription("reels_tray_container");
            }
        }
        if (this.A07 && this.A08) {
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_story_row_height);
            RecyclerView recyclerView10 = this.A03;
            if (recyclerView10 != null) {
                recyclerView10.A10(new C51186MjU(this, dimensionPixelSize));
                recyclerView10.setClipToPadding(false);
                recyclerView10.setClipChildren(false);
                recyclerView10.setPaddingRelative(dimensionPixelSize, 0, 0, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
                marginLayoutParams.setMarginStart(-dimensionPixelSize);
                recyclerView10.setLayoutParams(marginLayoutParams);
            }
        }
        if (C18U.A06(C06090Tz.A06, userSession, 36329869931463221L) && (recyclerView2 = this.A03) != null) {
            final Context context2 = recyclerView2.getContext();
            C50H c50h = new C50H(context2, recyclerView2, this) { // from class: X.50G
                public final Rect A00 = new Rect();
                public final Drawable A01;
                public final /* synthetic */ RecyclerView A02;
                public final /* synthetic */ C69473Ah A03;

                private final boolean A00(int i) {
                    Reel reel;
                    Reel reel2;
                    if (i > 0) {
                        C69523Am c69523Am = this.A03.A0C;
                        if (i < c69523Am.getItemCount() && (((reel = (Reel) c69523Am.Bla(i)) == null || !reel.A1O) && (reel2 = (Reel) c69523Am.Bla(i + 1)) != null && reel2.A1O)) {
                            return true;
                        }
                    }
                    return false;
                }

                @Override // X.C50H, X.AbstractC70653Fc
                public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView11, C3F5 c3f5) {
                    C14360o3.A0B(rect, 0);
                    C14360o3.A0B(view, 1);
                    C14360o3.A0B(recyclerView11, 2);
                    int A02 = RecyclerView.A02(view);
                    if (A00(A02)) {
                        Context context3 = this.A02.getContext();
                        C14360o3.A07(context3);
                        rect.right = (int) AbstractC13880nE.A04(context3, 12);
                    } else {
                        if (!A00(A02 - 1)) {
                            return;
                        }
                        Context context4 = this.A02.getContext();
                        C14360o3.A07(context4);
                        rect.left = (int) AbstractC13880nE.A04(context4, 12);
                    }
                }

                @Override // X.C50H, X.AbstractC70653Fc
                public final void onDraw(Canvas canvas, RecyclerView recyclerView11, C3F5 c3f5) {
                    C14360o3.A0B(canvas, 0);
                    C14360o3.A0B(recyclerView11, 1);
                    canvas.save();
                    Context context3 = this.A02.getContext();
                    C14360o3.A07(context3);
                    int A04 = (int) AbstractC13880nE.A04(context3, 30);
                    int A042 = (int) AbstractC13880nE.A04(context3, 72);
                    int childCount = recyclerView11.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = recyclerView11.getChildAt(i);
                        if (A00(RecyclerView.A02(childAt))) {
                            if (recyclerView11.A0D != null) {
                                RecyclerView.A0D(childAt, this.A00);
                            }
                            int round = this.A00.right + Math.round(childAt.getTranslationX());
                            Drawable drawable = this.A01;
                            if (drawable != null) {
                                drawable.setBounds(round - drawable.getIntrinsicWidth(), A04, round, A042);
                                drawable.draw(canvas);
                            }
                        }
                    }
                    canvas.restore();
                }

                {
                    this.A02 = recyclerView2;
                    this.A03 = this;
                    this.A01 = recyclerView2.getContext().getDrawable(R.drawable.highlight_divider_drawable);
                }
            };
            Drawable drawable = recyclerView2.getContext().getDrawable(R.drawable.highlight_divider_drawable);
            if (drawable != null) {
                c50h.A01 = drawable;
            }
            recyclerView2.A10(c50h);
        }
        C50F c50f = this.A06;
        if (c50f != null && (recyclerView = this.A03) != null) {
            recyclerView.A14(c50f);
        }
    }

    public final void A04() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2 = this.A03;
        if (recyclerView2 != null) {
            AbstractC70663Fe abstractC70663Fe = recyclerView2.A0D;
            if (abstractC70663Fe != null) {
                this.A00 = abstractC70663Fe.A1M();
                RecyclerView recyclerView3 = this.A03;
                C14360o3.A0A(recyclerView3);
                recyclerView3.setAdapter(null);
                C62882tR c62882tR = this.A0E;
                if (c62882tR != null) {
                    RecyclerView recyclerView4 = this.A03;
                    C14360o3.A0A(recyclerView4);
                    recyclerView4.A15(c62882tR);
                }
                this.A03 = null;
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        RecyclerView recyclerView5 = this.A02;
        if (recyclerView5 != null) {
            recyclerView5.setAdapter(null);
        }
        this.A02 = null;
        C50F c50f = this.A06;
        if (c50f != null && (recyclerView = this.A03) != null) {
            recyclerView.A15(c50f);
        }
    }

    public final void A06() {
        Reel reel = this.A05;
        if (reel == null) {
            RecyclerView recyclerView = this.A03;
            if (recyclerView != null) {
                recyclerView.A0n(0);
                return;
            }
            return;
        }
        RecyclerView recyclerView2 = this.A03;
        if (recyclerView2 != null) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView2.A0D;
            C69523Am c69523Am = this.A0C;
            C14360o3.A0A(reel);
            int CNP = c69523Am.CNP(reel);
            int i = this.A04;
            if (i != 0) {
                if (linearLayoutManager != null) {
                    linearLayoutManager.A1p(CNP, i);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            if (linearLayoutManager != null) {
                linearLayoutManager.A1O(CNP);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A07(int i) {
        RecyclerView recyclerView = this.A03;
        if (recyclerView != null && recyclerView.A0D != null) {
            C38347Gtj c38347Gtj = new C38347Gtj(this.A0D, this.A0B);
            ((AbstractC110824yu) c38347Gtj).A00 = i;
            AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
            C14360o3.A0A(abstractC70663Fe);
            abstractC70663Fe.A10(c38347Gtj);
        }
    }
}
