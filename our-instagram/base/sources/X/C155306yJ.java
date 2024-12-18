package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6yJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C155306yJ extends AbstractC155316yK implements InterfaceC69543Ao {
    public Bitmap A00;
    public InterfaceC156146zi A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public GXB A09;
    public C70873Fz A0A;
    public List A0B;
    public InterfaceC16660sJ A0C;
    public final UserSession A0D;
    public final C3G2 A0E;
    public final List A0F;
    public final List A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final Context A0J;
    public final InterfaceC11380iw A0K;
    public final C64012vM A0L;
    public final java.util.Set A0M;
    public final boolean A0N;
    public final boolean A0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.2xd, java.lang.Object] */
    public C155306yJ(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C3G2 c3g2, boolean z, boolean z2, boolean z3, boolean z4) {
        super((AbstractC65412xd) new Object());
        C14360o3.A0B(context, 1);
        C14360o3.A0B(userSession, 2);
        this.A0J = context;
        this.A0D = userSession;
        this.A0I = z;
        this.A0O = z2;
        this.A0N = z3;
        this.A0K = interfaceC11380iw;
        this.A0E = c3g2;
        this.A0H = z4;
        this.A0C = C155356yO.A00;
        this.A0F = new ArrayList();
        this.A0G = new ArrayList();
        this.A0L = C1OU.A02(interfaceC11380iw, userSession, null);
        this.A04 = true;
        this.A0M = new HashSet();
    }

    public final int A02(String str) {
        if (str != null) {
            List<InterfaceC152636tq> list = this.mDiffer.A02;
            C14360o3.A07(list);
            int i = 0;
            for (InterfaceC152636tq interfaceC152636tq : list) {
                if ((interfaceC152636tq instanceof C152676tu) && C14360o3.A0K(((C152676tu) interfaceC152636tq).A00.A03.getId(), str)) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    public final void A08(String str) {
        C3G4 A00;
        C14360o3.A0B(str, 0);
        if (this.A0F.contains(str) && (A00 = A00(this, str)) != null) {
            A00.A02 = true;
        }
    }

    @Override // X.InterfaceC69543Ao
    public final int CNP(Reel reel) {
        C14360o3.A0B(reel, 0);
        return A02(reel.getId());
    }

    @Override // X.InterfaceC69543Ao
    public final int CNQ(Reel reel, C41181vS c41181vS) {
        C14360o3.A0B(reel, 0);
        return A02(reel.getId());
    }

    @Override // X.InterfaceC69543Ao
    public final void EcN(List list, boolean z, UserSession userSession) {
        C14360o3.A0B(list, 0);
        A01(null, this, list, GVK.A00);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate;
        C3OO c72943Ou;
        C14360o3.A0B(viewGroup, 0);
        Context context = viewGroup.getContext();
        LayoutInflater from = LayoutInflater.from(context);
        switch (i) {
            case 0:
                InterfaceC156146zi interfaceC156146zi = this.A01;
                if (interfaceC156146zi != null) {
                    inflate = LayoutInflater.from(context).inflate(R.layout.layout_highlight_tray_button_row, viewGroup, false);
                    c72943Ou = new C152266tC(inflate, interfaceC156146zi);
                    inflate.setTag(c72943Ou);
                    return c72943Ou;
                }
                throw new IllegalArgumentException("Required value was null.");
            case 1:
                int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                C14360o3.A07(context);
                View inflate2 = LayoutInflater.from(context).inflate(R.layout.layout_reel_tray_button, viewGroup, false);
                C14360o3.A0A(inflate2);
                inflate2.setTag(new C152276tD(inflate2));
                c72943Ou = new C152276tD(inflate2);
                return c72943Ou;
            case 2:
                c72943Ou = C3OU.A00(context, viewGroup, this.A0D);
                return c72943Ou;
            case 3:
                int i3 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                View inflate3 = from.inflate(R.layout.highlights_tray_divider, viewGroup, false);
                C14360o3.A07(inflate3);
                c72943Ou = new C3OO(inflate3);
                return c72943Ou;
            case 4:
                inflate = LayoutInflater.from(context).inflate(R.layout.layout_highlight_tray_padding_item, viewGroup, false);
                c72943Ou = new C3OO(inflate);
                inflate.setTag(c72943Ou);
                return c72943Ou;
            case 5:
            default:
                throw new IllegalArgumentException(AnonymousClass001.A0O("unexpected viewType: ", i));
            case 6:
                View inflate4 = from.inflate(R.layout.reel_tray_pagination_loading_spinner, viewGroup, false);
                int i4 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                C14360o3.A0A(inflate4);
                c72943Ou = new C73883Sx(inflate4);
                return c72943Ou;
            case 7:
            case 9:
                C14360o3.A07(context);
                inflate = LayoutInflater.from(context).inflate(R.layout.reel_item_story_unit, viewGroup, false);
                int i5 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                C14360o3.A0A(inflate);
                c72943Ou = new C72943Ou(inflate);
                inflate.setTag(c72943Ou);
                return c72943Ou;
            case 8:
            case 10:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                C14360o3.A07(context);
                return AbstractC55158OdM.A00(context, viewGroup);
        }
    }

    @Override // X.C2UU
    public final void onViewAttachedToWindow(C3OO c3oo) {
        C14360o3.A0B(c3oo, 0);
        C70873Fz c70873Fz = this.A0A;
        if (c70873Fz != null) {
            InterfaceC152636tq interfaceC152636tq = (InterfaceC152636tq) getItem(c3oo.getBindingAdapterPosition());
            if (interfaceC152636tq instanceof C152676tu) {
                Reel reel = ((C152676tu) interfaceC152636tq).A00.A03;
                int i = 0;
                Iterator it = this.A0F.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (C14360o3.A0K(it.next(), reel.getId())) {
                            break;
                        } else {
                            i++;
                        }
                    } else {
                        i = -1;
                        break;
                    }
                }
                java.util.Set set = this.A0M;
                if (!set.contains(reel.getId())) {
                    String id = reel.getId();
                    C14360o3.A07(id);
                    set.add(id);
                    this.A0L.A02(reel, c70873Fz, Boolean.valueOf(this.A07), null, null, i);
                }
            }
        }
    }

    public static final C3G4 A00(C155306yJ c155306yJ, String str) {
        Object obj;
        Iterator it = c155306yJ.A0G.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (C14360o3.A0K(((C3G4) obj).A03.getId(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (C3G4) obj;
    }

    public final Reel A03(String str) {
        List list = this.A0G;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Reel reel = ((C3G4) list.get(i)).A03;
            if (C14360o3.A0K(reel.getId(), str)) {
                return reel;
            }
        }
        return null;
    }

    public final List A04() {
        List list = this.A0G;
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C3G4) it.next()).A03);
        }
        return arrayList;
    }

    public final void A05() {
        this.A0G.clear();
        this.A0F.clear();
        this.A0A = null;
        this.A0M.clear();
        submitList(C16930sl.A00);
    }

    public final void A06() {
        List list = this.A0B;
        if (list == null) {
            list = C16930sl.A00;
        }
        A01(this.A09, this, list, this.A0C);
    }

    public final void A07(String str) {
        List list = this.A0F;
        if (list.contains(str)) {
            AnonymousClass016.A1A(this.A0G, new C50361MLn(str, 13));
            list.remove(str);
            List list2 = this.mDiffer.A02;
            C14360o3.A07(list2);
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                InterfaceC152636tq interfaceC152636tq = (InterfaceC152636tq) obj;
                if (!(interfaceC152636tq instanceof C152676tu) || !C14360o3.A0K(((C152676tu) interfaceC152636tq).A00.A03.getId(), str)) {
                    arrayList.add(obj);
                }
            }
            submitList(arrayList);
        }
    }

    public final void A09(boolean z) {
        if (this.A07 != z) {
            this.A07 = z;
            A06();
        }
    }

    public final boolean A0A() {
        if (this.A0G.isEmpty()) {
            UserSession userSession = this.A0D;
            C14360o3.A0B(userSession, 0);
            if (!C18U.A06(C06090Tz.A05, userSession, 36322233479604286L)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a7, code lost:
    
        if (r13.A03.A0p() == false) goto L24;
     */
    @Override // X.C2UU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(X.C3OO r26, int r27) {
        /*
            Method dump skipped, instructions count: 726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C155306yJ.onBindViewHolder(X.3OO, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00db, code lost:
    
        if (r9.A03.A0l() == true) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00dd, code lost:
    
        r1 = new X.C152676tu(r6, r9, r14.A07);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x017d, code lost:
    
        if (r14.A03 != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0172, code lost:
    
        if (r0.intValue() > 0) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.GXB r13, final X.C155306yJ r14, java.util.List r15, final X.InterfaceC16660sJ r16) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C155306yJ.A01(X.GXB, X.6yJ, java.util.List, X.0sJ):void");
    }

    @Override // X.InterfaceC69543Ao
    public final Object Bla(int i) {
        Object item = getItem(i);
        if (!(item instanceof C152676tu)) {
            return null;
        }
        return item;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int i2;
        int A03 = C0f9.A03(1918439284);
        Object item = getItem(i);
        if (item instanceof C152776u5) {
            i2 = 6;
        } else if (item instanceof C152626tp) {
            i2 = 0;
            if (this.A07) {
                i2 = 11;
            }
        } else if (item instanceof C152786u6) {
            i2 = 7;
            if (this.A07) {
                i2 = 8;
            }
        } else if (item instanceof C152796u7) {
            i2 = 9;
            if (this.A07) {
                i2 = 10;
            }
        } else if (item instanceof C152646tr) {
            i2 = 3;
        } else if (item instanceof C152806u8) {
            i2 = 1;
            if (this.A07) {
                i2 = 12;
            }
        } else if (item instanceof C152676tu) {
            i2 = 2;
            if (this.A07) {
                i2 = 13;
            }
        } else {
            RuntimeException runtimeException = new RuntimeException();
            C0f9.A0A(1193710365, A03);
            throw runtimeException;
        }
        C0f9.A0A(-1544197244, A03);
        return i2;
    }
}
