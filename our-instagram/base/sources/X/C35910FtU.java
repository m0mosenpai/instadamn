package X;

import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* renamed from: X.FtU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35910FtU implements C53O {
    public final /* synthetic */ C143266dR A00;
    public final /* synthetic */ AbstractC439921h A01;
    public final /* synthetic */ C34690FQb A02;

    @Override // X.C53O
    public final void Cya() {
    }

    @Override // X.C53O
    public final /* synthetic */ void Cym() {
    }

    public C35910FtU(C143266dR c143266dR, AbstractC439921h abstractC439921h, C34690FQb c34690FQb) {
        this.A02 = c34690FQb;
        this.A01 = abstractC439921h;
        this.A00 = c143266dR;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // X.C53O
    public final void CyY() {
        ?? r4;
        RecyclerView recyclerView;
        C2UU c2uu;
        java.util.Set A07 = AbstractC16830sb.A07(C7P3.A04, C7P3.A05);
        WeakReference weakReference = this.A02.A0A;
        RecyclerView recyclerView2 = (RecyclerView) weakReference.get();
        if (recyclerView2 != null && recyclerView2.A0A != null) {
            C17u A0C = C17s.A0C(0, recyclerView2.getChildCount());
            r4 = AbstractC166987dD.A1E();
            Iterator it = A0C.iterator();
            while (it.hasNext()) {
                C3OO A0Y = recyclerView2.A0Y(recyclerView2.getChildAt(((AbstractC16880sg) it).A00()));
                if (A0Y instanceof AbstractC161687Md) {
                    AbstractC161687Md abstractC161687Md = (AbstractC161687Md) A0Y;
                    C7VC c7vc = abstractC161687Md.A00;
                    if (c7vc instanceof C160787Im) {
                        String A00 = AbstractC111324zv.A00(240);
                        C14360o3.A0C(c7vc, A00);
                        if (A07.contains(((C160787Im) c7vc).A03())) {
                            C7VC c7vc2 = abstractC161687Md.A00;
                            C14360o3.A0C(c7vc2, A00);
                            if (c7vc2 != null) {
                                r4.add(c7vc2);
                            }
                        }
                    }
                }
            }
        } else {
            r4 = C16930sl.A00;
        }
        C14360o3.A0B(r4, 0);
        if (AbstractC162487Pl.A08(r4) && (recyclerView = (RecyclerView) weakReference.get()) != null && (c2uu = recyclerView.A0A) != null) {
            c2uu.notifyDataSetChanged();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0053, code lost:
    
        r4.A00(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0056, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        if (r1 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (r4.A05.A00() != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
    
        r3 = r10.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if (r3.A02() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        r7 = new X.C50168MDv(25, r4, r2);
        r0 = r4.A01;
        r6 = X.C07S.STARTED;
        r5 = r0.getViewLifecycleOwner();
        X.AbstractC166987dD.A1Z(new X.JTH(r3, r4, r5, r6, r7, (X.InterfaceC23621Ds) null, 33), X.C07Y.A00(r5));
        r3.A00();
     */
    @Override // X.C53O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Cyb() {
        /*
            r10 = this;
            X.FQb r4 = r10.A02
            com.instagram.avatars.store.AvatarStore r0 = r4.A02
            X.21d r0 = r0.A01
            X.21h r3 = r0.A00
            X.21h r1 = r10.A01
            X.5ly r0 = X.C125525ly.A00
            boolean r0 = X.C14360o3.A0K(r1, r0)
            r2 = 1
            if (r0 == 0) goto L4e
            X.5lz r0 = X.C125535lz.A00
            boolean r0 = X.C14360o3.A0K(r3, r0)
            if (r0 == 0) goto L4e
            r1 = 1
            X.L68 r0 = r4.A05
            boolean r0 = r0.A00()
            if (r0 == 0) goto L4f
        L24:
            X.6dR r3 = r10.A00
            boolean r0 = r3.A02()
            if (r0 == 0) goto L53
            r0 = 25
            X.MDv r7 = new X.MDv
            r7.<init>(r0, r4, r2)
            androidx.fragment.app.Fragment r0 = r4.A01
            X.07S r6 = X.C07S.STARTED
            X.07X r5 = r0.getViewLifecycleOwner()
            X.2k6 r0 = X.C07Y.A00(r5)
            r8 = 0
            r9 = 33
            X.JTH r2 = new X.JTH
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            X.AbstractC166987dD.A1Z(r2, r0)
            r3.A00()
            return
        L4e:
            r1 = 0
        L4f:
            r2 = 0
            if (r1 == 0) goto L53
            goto L24
        L53:
            r4.A00(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35910FtU.Cyb():void");
    }
}
