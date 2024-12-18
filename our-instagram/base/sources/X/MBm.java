package X;

import com.instagram.api.schemas.CommentGiphyMediaInfo;
import com.instagram.comments.mvvm.data.MediaCommentListRepository;

/* loaded from: classes8.dex */
public final class MBm extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public final int A02 = 0;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;
    public final Object A0A;
    public final String A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MBm(CommentGiphyMediaInfo commentGiphyMediaInfo, MOF mof, InterfaceC30934Dio interfaceC30934Dio, MediaCommentListRepository mediaCommentListRepository, C51618MrB c51618MrB, C115925Mi c115925Mi, C115935Mj c115935Mj, InterfaceC38371qR interfaceC38371qR, String str, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16820sZ interfaceC16820sZ) {
        super(2, interfaceC23621Ds);
        this.A03 = c51618MrB;
        this.A0A = mediaCommentListRepository;
        this.A09 = interfaceC38371qR;
        this.A07 = commentGiphyMediaInfo;
        this.A04 = c115925Mi;
        this.A08 = c115935Mj;
        this.A0B = str;
        this.A01 = interfaceC16820sZ;
        this.A06 = interfaceC30934Dio;
        this.A05 = mof;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        int i = this.A02;
        C51618MrB c51618MrB = (C51618MrB) this.A03;
        MediaCommentListRepository mediaCommentListRepository = (MediaCommentListRepository) this.A0A;
        InterfaceC38371qR interfaceC38371qR = (InterfaceC38371qR) this.A09;
        CommentGiphyMediaInfo commentGiphyMediaInfo = (CommentGiphyMediaInfo) this.A07;
        C115925Mi c115925Mi = (C115925Mi) this.A04;
        C115935Mj c115935Mj = (C115935Mj) this.A08;
        String str = this.A0B;
        if (i != 0) {
            InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A01;
            return new MBm(commentGiphyMediaInfo, (MOF) this.A05, (InterfaceC30934Dio) this.A06, mediaCommentListRepository, c51618MrB, c115925Mi, c115935Mj, interfaceC38371qR, str, interfaceC23621Ds, interfaceC16820sZ);
        }
        MBm mBm = new MBm(commentGiphyMediaInfo, (MOF) this.A05, (InterfaceC30934Dio) this.A06, mediaCommentListRepository, c51618MrB, c115925Mi, c115935Mj, interfaceC38371qR, str, interfaceC23621Ds);
        mBm.A01 = obj;
        return mBm;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x024c  */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 645
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MBm.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MBm) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MBm(CommentGiphyMediaInfo commentGiphyMediaInfo, MOF mof, InterfaceC30934Dio interfaceC30934Dio, MediaCommentListRepository mediaCommentListRepository, C51618MrB c51618MrB, C115925Mi c115925Mi, C115935Mj c115935Mj, InterfaceC38371qR interfaceC38371qR, String str, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A03 = c51618MrB;
        this.A0A = mediaCommentListRepository;
        this.A09 = interfaceC38371qR;
        this.A07 = commentGiphyMediaInfo;
        this.A04 = c115925Mi;
        this.A08 = c115935Mj;
        this.A0B = str;
        this.A06 = interfaceC30934Dio;
        this.A05 = mof;
    }
}
