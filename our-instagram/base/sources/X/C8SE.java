package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.8SE, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8SE extends C2UU {
    public final int A00;
    public final int A01;
    public final Adapter A02;
    public final InterfaceC159417Dc A03;
    public final C159747Em A04;
    public final boolean A05;
    public final int A06;
    public final int A07;
    public final Context A08;
    public final C8SB A09;
    public final C8SI A0A;
    public final InterfaceC11380iw A0B;
    public final C8SG A0C;
    public final C187318Ry A0D;
    public final InterfaceC187328Rz A0E;
    public final C8SH A0F;
    public final Integer A0G;
    public final Integer A0H;
    public final InterfaceC16820sZ A0I;

    /* JADX WARN: Code restructure failed: missing block: B:42:0x009a, code lost:
    
        if (r10.A05 == false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // X.C2UU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(X.C3OO r11, int r12) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8SE.onBindViewHolder(X.3OO, int):void");
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C3OO c219869nY;
        C14360o3.A0B(viewGroup, 0);
        if (i != 4) {
            LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
            if (i != 5) {
                View inflate = from.inflate(R.layout.media_thumbnail_tray_item, viewGroup, false);
                View findViewById = inflate.findViewById(R.id.thumbnail_image);
                C14360o3.A07(findViewById);
                int i2 = this.A01;
                AbstractC13880nE.A0g(findViewById, i2);
                View findViewById2 = inflate.findViewById(R.id.thumbnail_image);
                C14360o3.A07(findViewById2);
                int i3 = this.A00;
                AbstractC13880nE.A0W(findViewById2, i3);
                AbstractC13880nE.A0j(inflate, this.A07, this.A06);
                Integer num = this.A0H;
                if (num != null) {
                    AbstractC13880nE.A0b(inflate, num.intValue());
                }
                Integer num2 = this.A0G;
                if (num2 != null) {
                    AbstractC13880nE.A0Z(inflate, num2.intValue());
                }
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3 && i != 6) {
                                throw new UnsupportedOperationException("Unknown item type");
                            }
                            c219869nY = new C9V0(inflate, this.A09, this.A0E);
                        } else {
                            C8SH c8sh = this.A0F;
                            c219869nY = new C219859nX(inflate, this.A09, this.A0E, c8sh);
                        }
                    } else {
                        c219869nY = new C219849nW(inflate, this.A09, this.A0E, i2, i3);
                    }
                } else {
                    c219869nY = new C219869nY(inflate, this.A09, this.A0C, this.A0E);
                }
                return c219869nY;
            }
            View inflate2 = from.inflate(R.layout.media_thumbnail_tray_empty_item, viewGroup, false);
            View findViewById3 = inflate2.findViewById(R.id.thumbnail_image);
            C14360o3.A07(findViewById3);
            AbstractC13880nE.A0g(findViewById3, this.A01);
            AbstractC13880nE.A0j(inflate2, this.A07, this.A06);
            return new C210869Uj(inflate2);
        }
        View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.media_thumbnail_tray_plus_item, viewGroup, false);
        View findViewById4 = inflate3.findViewById(R.id.background_image_view);
        C14360o3.A07(findViewById4);
        AbstractC13880nE.A0g(findViewById4, this.A01);
        AbstractC13880nE.A0j(inflate3, this.A07, this.A06);
        return new C210879Uk(inflate3, this.A0D);
    }

    public C8SE(Context context, Adapter adapter, C8SB c8sb, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC159417Dc interfaceC159417Dc, C187318Ry c187318Ry, InterfaceC187328Rz interfaceC187328Rz, C159747Em c159747Em, Integer num, Integer num2, InterfaceC16820sZ interfaceC16820sZ, float f, int i, int i2, int i3, boolean z) {
        C14360o3.A0B(interfaceC11380iw, 3);
        this.A08 = context;
        this.A0B = interfaceC11380iw;
        this.A03 = interfaceC159417Dc;
        this.A0E = interfaceC187328Rz;
        this.A0D = c187318Ry;
        this.A09 = c8sb;
        this.A05 = z;
        this.A07 = i2;
        this.A06 = i3;
        this.A0H = num;
        this.A0G = num2;
        this.A0I = interfaceC16820sZ;
        this.A04 = c159747Em;
        this.A02 = adapter;
        int i4 = i - (i3 + i2);
        this.A00 = i4;
        int A01 = C1H4.A01(i4 * f);
        this.A01 = A01;
        this.A0C = new C8SF(context, userSession, C05F.A00, A01, i4, false);
        this.A0F = new C8SH(context, userSession, A01, i4);
        this.A0A = new C8SI(1L);
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int i;
        int A03 = C0f9.A03(1425947325);
        C187318Ry c187318Ry = this.A0D;
        int count = this.A03.getCount();
        if (c187318Ry != null) {
            count += c187318Ry.A0D ? 1 : 0;
            i = -368210418;
        } else {
            i = 1707148407;
        }
        C0f9.A0A(i, A03);
        return count;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final long getItemId(int i) {
        long j;
        int A03 = C0f9.A03(1581723580);
        InterfaceC159417Dc interfaceC159417Dc = this.A03;
        if (i < interfaceC159417Dc.getCount() && i >= 0) {
            j = this.A0A.A00(interfaceC159417Dc.BJy(i).A01.A0A);
        } else {
            j = 0;
        }
        C0f9.A0A(-2099080966, A03);
        return j;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int i2;
        int i3;
        int A03 = C0f9.A03(1348447289);
        if (getItemId(i) == 0) {
            i2 = 4;
            i3 = -1604115487;
        } else {
            switch (this.A03.BJy(i).A01.A09.intValue()) {
                case 0:
                    i2 = 0;
                    break;
                case 1:
                case 3:
                case 4:
                default:
                    UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Unknown item type");
                    C0f9.A0A(332639428, A03);
                    throw unsupportedOperationException;
                case 2:
                    i2 = 6;
                    break;
                case 5:
                    i2 = 1;
                    break;
                case 6:
                    i2 = 2;
                    break;
                case 7:
                    i2 = 3;
                    break;
                case 8:
                    i2 = 5;
                    break;
            }
            i3 = -1178385844;
        }
        C0f9.A0A(i3, A03);
        return i2;
    }
}
