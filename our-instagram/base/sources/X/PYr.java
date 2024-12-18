package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec;
import com.instagram.profilecard.domain.ProfileCardViewModel;
import java.util.List;

/* loaded from: classes9.dex */
public final class PYr extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public final int A08 = 0;
    public final Object A09;
    public final Object A0A;
    public final Object A0B;
    public final Object A0C;
    public final String A0D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PYr(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, O7E o7e, ProfileCardViewModel profileCardViewModel, String str, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A0A = profileCardViewModel;
        this.A0C = o7e;
        this.A09 = fragmentActivity;
        this.A0B = interfaceC11380iw;
        this.A0D = str;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        if (this.A08 != 0) {
            ProfileCardViewModel profileCardViewModel = (ProfileCardViewModel) this.A0A;
            PYr pYr = new PYr((FragmentActivity) this.A09, (InterfaceC11380iw) this.A0B, (O7E) this.A0C, profileCardViewModel, this.A0D, interfaceC23621Ds);
            pYr.A02 = obj;
            return pYr;
        }
        List list = (List) this.A02;
        InterfaceC23621Ds interfaceC23621Ds2 = (InterfaceC23621Ds) this.A0C;
        return new PYr((C22P) this.A09, (CameraSpec) this.A0B, (OA4) this.A0A, this.A0D, list, interfaceC23621Ds2, interfaceC23621Ds);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00dd, code lost:
    
        if (X.AbstractC89993zf.A00(r15) == r5) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01b7 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x006f A[Catch: Exception -> 0x023e, TryCatch #1 {Exception -> 0x023e, blocks: (B:55:0x009e, B:56:0x00a1, B:57:0x0069, B:59:0x006f, B:62:0x01d1, B:80:0x0053), top: B:51:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d1 A[Catch: Exception -> 0x023e, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x023e, blocks: (B:55:0x009e, B:56:0x00a1, B:57:0x0069, B:59:0x006f, B:62:0x01d1, B:80:0x0053), top: B:51:0x002e }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x009c -> B:54:0x00a1). Please report as a decompilation issue!!! */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PYr.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PYr) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PYr(C22P c22p, CameraSpec cameraSpec, OA4 oa4, String str, List list, InterfaceC23621Ds interfaceC23621Ds, InterfaceC23621Ds interfaceC23621Ds2) {
        super(2, interfaceC23621Ds2);
        this.A02 = list;
        this.A0C = interfaceC23621Ds;
        this.A0A = oa4;
        this.A0D = str;
        this.A09 = c22p;
        this.A0B = cameraSpec;
    }
}
