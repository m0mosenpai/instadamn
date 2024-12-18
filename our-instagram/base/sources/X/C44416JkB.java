package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.facebook.R;
import com.instagram.creation.base.MediaSession;
import java.util.List;

/* renamed from: X.JkB, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44416JkB extends BaseAdapter {
    public final InterfaceC11380iw A00;
    public final AnonymousClass840 A01;
    public final InterfaceC189598ae A02;

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 2);
        AnonymousClass840 anonymousClass840 = this.A01;
        List CpK = anonymousClass840.A00().CpK();
        if (view == null) {
            if (((MediaSession) CpK.get(i)).Btq().intValue() != 0) {
                view = AbstractC25228BEl.A0P(viewGroup).inflate(R.layout.layout_video_preview, viewGroup, false);
                view.setTag(new L2T(view));
            } else {
                view = LBM.A00(viewGroup);
            }
        }
        C47Z BcC = this.A02.BcC(((MediaSession) CpK.get(i)).BcD());
        if (getItemViewType(i) == 0 && BcC != null) {
            Object tag = view.getTag();
            C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.creation.album.MediaPreviewPhotoViewBinder.Holder");
            float AB3 = anonymousClass840.A00().AB3();
            LBM.A01(this.A00, (C46505Ki4) tag, BcC, AB3);
        }
        return view;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.A01.A00().CpK().size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.A01.A00().CpK().get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        String A0M = JQ1.A0M(this.A01.A00(), i);
        if (A0M != null) {
            return Long.parseLong(A0M);
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        if (((MediaSession) this.A01.A00().CpK().get(i)).Btq().intValue() != 0) {
            return 1;
        }
        return 0;
    }

    public C44416JkB(InterfaceC11380iw interfaceC11380iw, AnonymousClass840 anonymousClass840, InterfaceC189598ae interfaceC189598ae) {
        AbstractC167027dH.A13(anonymousClass840, interfaceC189598ae, interfaceC11380iw);
        this.A01 = anonymousClass840;
        this.A02 = interfaceC189598ae;
        this.A00 = interfaceC11380iw;
    }
}
