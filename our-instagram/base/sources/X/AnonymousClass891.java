package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.891, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass891 {
    public C88X A00;
    public List A01;
    public boolean A02;
    public boolean A03;
    public final Context A04;
    public final AbstractC018607g A05;
    public final UserSession A06;
    public final AnonymousClass890 A07;

    public static C88X A00(AnonymousClass891 anonymousClass891) {
        C88Z c88z = C88Z.A0Y;
        Context context = anonymousClass891.A04;
        String string = context.getString(2131971304);
        ShapeDrawable A03 = AMo.A03(AbstractC53242c7.A0F(context, R.attr.igds_color_elevated_background_dark));
        int A0H = AbstractC53242c7.A0H(context, R.attr.igds_color_primary_button_icon);
        Paint paint = C3LQ.A00;
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{A03, C3LQ.A05(context, R.drawable.instagram_add_users_pano_outline_24, context.getColor(A0H))});
        int A01 = C1H4.A01(AbstractC13880nE.A04(context, 22));
        layerDrawable.setLayerInset(1, A01, A01, A01, A01);
        return new C88X(new C189128Zd(layerDrawable, c88z, string));
    }

    public static C88X A01(AnonymousClass891 anonymousClass891) {
        C88Z c88z = C88Z.A0Z;
        Context context = anonymousClass891.A04;
        C189128Zd c189128Zd = new C189128Zd(AbstractC172497mJ.A00(context), c88z, context.getString(2131971306));
        c189128Zd.A01 = AbstractC34041F0u.A00(anonymousClass891.A06);
        return new C88X(c189128Zd);
    }

    private void A02(boolean z) {
        Integer num;
        UserSession userSession = this.A06;
        if (!AbstractC70443Ed.A03(userSession)) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(A01(this));
            this.A01 = arrayList;
            this.A07.DA6(arrayList);
            return;
        }
        Context context = this.A04;
        AbstractC018607g abstractC018607g = this.A05;
        if (z) {
            num = C05F.A01;
        } else {
            num = C05F.A0C;
        }
        C14360o3.A0B(userSession, 0);
        C1Ee c1Ee = new C1Ee();
        c1Ee.A05("timezone_offset", String.valueOf(C23831Eq.A00()));
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        List singletonList = Collections.singletonList("quick_snap");
        C14360o3.A07(singletonList);
        c25621Ms.A06();
        c25621Ms.A03();
        String A00 = AbstractC111324zv.A00(3911);
        c25621Ms.A0B(A00);
        c25621Ms.A0R(C214309eU.class, ADE.class);
        c25621Ms.A9s("list_types", AbstractC13590ml.A00(singletonList));
        c25621Ms.A0A = c1Ee.A01(A00);
        c25621Ms.A07 = num;
        if (num == C05F.A0C) {
            ((AbstractC23721Ec) c25621Ms).A01 = 604800000L;
        }
        C1ON A0N = c25621Ms.A0N();
        A0N.A00 = new C1P1() { // from class: X.9gK
            /* JADX WARN: Code restructure failed: missing block: B:31:0x017a, code lost:
            
                if (r0 != null) goto L54;
             */
            /* JADX WARN: Code restructure failed: missing block: B:32:0x017c, code lost:
            
                r12 = r0.getUsername();
             */
            /* JADX WARN: Code restructure failed: missing block: B:33:0x0180, code lost:
            
                r6[1] = r12;
             */
            /* JADX WARN: Code restructure failed: missing block: B:39:0x015c, code lost:
            
                if (r0 != null) goto L54;
             */
            @Override // X.C1P1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r28) {
                /*
                    Method dump skipped, instructions count: 538
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C215449gK.onSuccess(java.lang.Object):void");
            }

            @Override // X.C1P1
            public final void onFail(AbstractC115105If abstractC115105If) {
                C0f9.A0A(561217249, C0f9.A03(-614250741));
            }

            @Override // X.C1P1
            public final void onFinish() {
                int A03 = C0f9.A03(1949573294);
                AnonymousClass891.this.A02 = true;
                C0f9.A0A(32533112, A03);
            }
        };
        C1GJ.A00(context, abstractC018607g, A0N);
    }

    public final C88X A03() {
        return new C88X(new C189128Zd(this.A04.getDrawable(R.drawable.canvas_type_mode_icon), C88Z.A0g, ""));
    }

    public final List A04(boolean z) {
        if (z != this.A03) {
            this.A01 = null;
            this.A03 = z;
        }
        if (this.A01 == null) {
            ArrayList arrayList = new ArrayList();
            this.A01 = arrayList;
            if (z) {
                boolean A03 = AbstractC70443Ed.A03(this.A06);
                List list = this.A01;
                if (A03) {
                    ArrayList arrayList2 = new ArrayList(2);
                    arrayList2.add(A00(this));
                    arrayList2.add(A01(this));
                    list.addAll(arrayList2);
                    C88X c88x = this.A00;
                    if (c88x != null) {
                        this.A01.add(c88x);
                    }
                } else {
                    ArrayList arrayList3 = new ArrayList(1);
                    arrayList3.add(A01(this));
                    list.addAll(arrayList3);
                }
            } else {
                arrayList.add(A03());
            }
            if (this.A03) {
                A02(false);
            } else {
                Context context = this.A04;
                AbstractC018607g abstractC018607g = this.A05;
                C1ON A00 = AbstractC226419yy.A00(this.A06, C05F.A0C);
                A00.A00 = new C1P1() { // from class: X.9g6
                    @Override // X.C1P1
                    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                        int A032 = C0f9.A03(645862349);
                        int A033 = C0f9.A03(1008951493);
                        int i = 1764885226;
                        if (AnonymousClass891.this.A02) {
                            i = -492425525;
                        }
                        C0f9.A0A(i, A033);
                        C0f9.A0A(320643796, A032);
                    }
                };
                C1GJ.A00(context, abstractC018607g, A00);
            }
        }
        this.A02 = false;
        if (this.A03) {
            A02(true);
        } else {
            Context context2 = this.A04;
            AbstractC018607g abstractC018607g2 = this.A05;
            C1ON A002 = AbstractC226419yy.A00(this.A06, C05F.A01);
            A002.A00 = new C1P1() { // from class: X.9gJ
                @Override // X.C1P1
                public final void onFail(AbstractC115105If abstractC115105If) {
                    int A032 = C0f9.A03(985549653);
                    StringBuilder A1C = AbstractC166987dD.A1C();
                    A1C.append("Failed to fetch dial elements: ");
                    AbstractC12120kG.A01("DialFetcher", AbstractC166997dE.A0v(abstractC115105If.A01(), A1C));
                    C0f9.A0A(505946000, A032);
                }

                @Override // X.C1P1
                public final void onFinish() {
                    int A032 = C0f9.A03(-910535627);
                    AnonymousClass891.this.A02 = true;
                    C0f9.A0A(-665695537, A032);
                }

                /* JADX WARN: Failed to find 'out' block for switch in B:19:0x006a. Please report as an issue. */
                /* JADX WARN: Removed duplicated region for block: B:24:0x00cb A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:27:0x00da  */
                /* JADX WARN: Removed duplicated region for block: B:31:0x00e5 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:34:0x00e9  */
                /* JADX WARN: Removed duplicated region for block: B:37:0x00f6 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:40:0x00f1 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:50:0x00cb A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:51:0x00e5 A[SYNTHETIC] */
                @Override // X.C1P1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r12) {
                    /*
                        Method dump skipped, instructions count: 300
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C215439gJ.onSuccess(java.lang.Object):void");
                }
            };
            C1GJ.A00(context2, abstractC018607g2, A002);
        }
        return this.A01;
    }

    public AnonymousClass891(Context context, AbstractC018607g abstractC018607g, C88X c88x, UserSession userSession, AnonymousClass890 anonymousClass890, boolean z) {
        this.A04 = context;
        this.A06 = userSession;
        this.A07 = anonymousClass890;
        this.A05 = abstractC018607g;
        this.A00 = c88x;
        this.A03 = z;
    }
}
