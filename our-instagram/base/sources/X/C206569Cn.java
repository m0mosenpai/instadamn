package X;

import com.instagram.comments.mvvm.data.MediaCommentListRepository;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository;

/* renamed from: X.9Cn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206569Cn extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public boolean A09;
    public final int A0A;
    public final Object A0B;

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        int i = this.A0A;
        this.A08 = obj;
        this.A00 |= Integer.MIN_VALUE;
        switch (i) {
            case 0:
                return MediaCommentListRepository.A07((MediaCommentListRepository) this.A0B, null, null, this, null, null, false);
            case 1:
                return MediaCommentListRepository.A01(null, null, (MediaCommentListRepository) this.A0B, null, null, null, this, false);
            default:
                return ((ClipsDraftRepository) this.A0B).A0B(null, null, this, false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C206569Cn(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A0A = i;
        this.A0B = obj;
    }
}
