package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Parcelable;
import androidx.recyclerview.widget.GridLayoutManager;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.layout.MultiTouchRecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.Ag1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23790Ag1 implements InterfaceC71977XDk, C82M, C8HK {
    public int A00;
    public EnumC172837mv A01;
    public final Activity A02;
    public final Context A03;
    public final GridLayoutManager A04;
    public final C8SB A05;
    public final UserSession A06;
    public final C57012jc A07;
    public final C8XV A08;
    public final AnonymousClass840 A09;
    public final C8C0 A0A;
    public final C210089Qx A0B;
    public final UH0 A0C;
    public final InterfaceC1810081c A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final C1GL A0G;
    public final TargetViewSizeProvider A0H;
    public final InterfaceC1810781j A0I;
    public final InterfaceC1810781j A0J;

    @Override // X.C82M
    public final /* synthetic */ void A7T(Parcelable parcelable) {
    }

    @Override // X.C8HK
    public final C174757qB Ajx() {
        return null;
    }

    @Override // X.InterfaceC71977XDk
    public final boolean CSU() {
        return true;
    }

    @Override // X.InterfaceC71977XDk
    public final boolean CSk() {
        return true;
    }

    @Override // X.C8HK
    public final boolean CfS() {
        return true;
    }

    public C23790Ag1(Activity activity, Context context, UserSession userSession, C1GL c1gl, C57012jc c57012jc, TargetViewSizeProvider targetViewSizeProvider, C8XV c8xv, AnonymousClass840 anonymousClass840, C8C0 c8c0, InterfaceC1810081c interfaceC1810081c) {
        AbstractC167017dG.A1S(interfaceC1810081c, anonymousClass840);
        C14360o3.A0B(c8c0, 6);
        AbstractC167007dF.A1I(c1gl, 7, c8xv);
        C14360o3.A0B(c57012jc, 9);
        this.A03 = context;
        this.A02 = activity;
        this.A06 = userSession;
        this.A0D = interfaceC1810081c;
        this.A09 = anonymousClass840;
        this.A0A = c8c0;
        this.A0G = c1gl;
        this.A08 = c8xv;
        this.A07 = c57012jc;
        this.A0H = targetViewSizeProvider;
        InterfaceC1812882f interfaceC1812882f = ((NineSixteenLayoutConfigImpl) targetViewSizeProvider).A0K;
        float width = interfaceC1812882f.getWidth();
        float height = interfaceC1812882f.getHeight();
        C9PZ c9pz = new C9PZ(this, 3);
        this.A0J = c9pz;
        C9PZ c9pz2 = new C9PZ(this, 2);
        this.A0I = c9pz2;
        this.A0E = AbstractC09440dt.A01(new B8R(this, 14));
        this.A0F = AbstractC09440dt.A01(new B8R(this, 15));
        UH0 uh0 = new UH0(null, this, (int) width, (int) height);
        this.A0C = uh0;
        this.A0B = new C210089Qx(context, width, height);
        this.A01 = EnumC172837mv.A0I;
        interfaceC1810081c.A85(c9pz);
        interfaceC1810081c.A82(c9pz2);
        this.A04 = new GridLayoutManager(context, this.A01.A00);
        this.A05 = new C8SB(new C210109Qz(uh0));
        c57012jc.A02 = new C23713Aem(this, 2);
    }

    public static final void A00(C23790Ag1 c23790Ag1) {
        C57012jc c57012jc = c23790Ag1.A07;
        Bitmap createBitmap = Bitmap.createBitmap(c57012jc.A01().getWidth(), c57012jc.A01().getHeight(), Bitmap.Config.ARGB_8888);
        c57012jc.A01().draw(new Canvas(createBitmap));
        C14360o3.A07(createBitmap);
        ArrayList arrayList = c23790Ag1.A0C.A05;
        ArrayList A0i = AbstractC167007dF.A0i(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            A0i.add(((C22919A8p) it.next()).A03);
        }
        int i = 0;
        if (!(A0i instanceof Collection) || !A0i.isEmpty()) {
            Iterator it2 = A0i.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                } else if (AbstractC166987dD.A0l(it2).A0G.A0B) {
                    i = 54;
                    break;
                }
            }
        }
        ArrayList A0i2 = AbstractC167007dF.A0i(A0i);
        Iterator it3 = A0i.iterator();
        while (it3.hasNext()) {
            A0i2.add(AbstractC166987dD.A0l(it3).A0G);
        }
        MediaUploadMetadata A00 = C915947r.A00(A0i2);
        c23790Ag1.A0G.schedule(new C196808nA(c23790Ag1.A03, createBitmap, null, null, null, null, null, null, null, null, A00, c23790Ag1.A06, c23790Ag1.A0H, c23790Ag1, null, null, null, null, null, null, null, null, null, null, null, "unknown", "layout", null, c23790Ag1.A01.A05, null, null, null, i, true, false, false));
    }

    @Override // X.C82M
    public final /* synthetic */ Parcelable ANh() {
        return null;
    }

    @Override // X.InterfaceC71977XDk
    public final void DDb() {
        ((MultiTouchRecyclerView) this.A07.A01()).A00 = false;
    }

    @Override // X.C8HK
    public final void DYP(String str) {
        C11T.A02(new RunnableC24381ArO(this));
    }

    @Override // X.C8HK
    public final void DYQ(C183978Ee c183978Ee) {
        C11T.A02(new RunnableC24641Avb(this, c183978Ee));
    }

    @Override // X.InterfaceC71977XDk
    public final void Dnz(C3OO c3oo) {
        ((MultiTouchRecyclerView) this.A07.A01()).A00 = true;
        this.A05.A07(c3oo);
    }
}
