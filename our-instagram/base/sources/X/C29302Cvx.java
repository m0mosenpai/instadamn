package X;

import com.instagram.comments.mvvm.data.MediaCommentListRepository;
import com.instagram.user.model.User;

/* renamed from: X.Cvx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29302Cvx implements InterfaceC199918sv {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C29302Cvx(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // X.InterfaceC199918sv
    public final void onClick() {
        Integer num;
        MediaCommentListRepository mediaCommentListRepository;
        C38321qM c38321qM;
        String str;
        C18950wb c18950wb;
        String str2;
        switch (this.A00) {
            case 0:
                EnumC27402C7f enumC27402C7f = (EnumC27402C7f) this.A01;
                EnumC166067ba enumC166067ba = enumC27402C7f.A01;
                EnumC166067ba enumC166067ba2 = EnumC166067ba.A04;
                C25814BbV c25814BbV = ((C26345Bkq) this.A02).A01;
                if (enumC166067ba != enumC166067ba2) {
                    c25814BbV.A0T(enumC166067ba, enumC27402C7f.A02);
                    return;
                }
                num = enumC27402C7f.A02;
                C14360o3.A0B(num, 0);
                mediaCommentListRepository = c25814BbV.A0A;
                break;
            case 1:
                ((InterfaceC16660sJ) this.A02).invoke(this.A01);
                return;
            default:
                Jn5 jn5 = ((C26348Bkt) this.A02).A02;
                num = ((EnumC27402C7f) this.A01).A02;
                C14360o3.A0B(num, 0);
                C675432t c675432t = jn5.A02;
                InterfaceC38371qR interfaceC38371qR = jn5.A06.A00;
                if (interfaceC38371qR != null) {
                    c38321qM = interfaceC38371qR.BQN();
                } else {
                    c38321qM = null;
                }
                String A00 = AbstractC43591JPw.A00(106);
                if (c38321qM != null) {
                    String A0T = AnonymousClass001.A0T(A00, AbstractC166107be.A00(num), '_');
                    User A2E = c38321qM.A2E(c675432t.A03);
                    switch (num.intValue()) {
                        case 0:
                            str = AbstractC111324zv.A00(2883);
                            break;
                        case 1:
                            str = AbstractC43591JPw.A00(196);
                            break;
                        case 2:
                            str = AbstractC111324zv.A00(4924);
                            break;
                        case 3:
                            str = "followers";
                            break;
                        case 4:
                            str = MSV.A00(247);
                            break;
                        case 5:
                            str = "questions";
                            break;
                        case 6:
                            str = null;
                            break;
                        default:
                            throw B4Z.A00();
                    }
                    if (A2E == null) {
                        c18950wb = C18950wb.A01;
                        str2 = "COMMENTS_LOGGER: Media Author Id is null.";
                    } else if (str == null) {
                        c18950wb = C18950wb.A01;
                        str2 = "COMMENTS_LOGGER: SortOrder is null.";
                    } else {
                        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c675432t.A02, "ig_comments_context_menu_toggle");
                        String A2u = c38321qM.A2u();
                        if (A2u != null) {
                            AbstractC25236BEt.A0r(A0f, A2u);
                            AbstractC25230BEn.A1D(A0f, Long.parseLong(A2E.getId()));
                            A0f.AAP(AbstractC111324zv.A00(3120), str);
                            AbstractC25225BEi.A1O(A0f, A0T);
                            A0f.Cht();
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    }
                    C0f5 AEp = c18950wb.AEp(str2, 817896325);
                    AEp.ABW("Media Id", c38321qM.getId());
                    AEp.report();
                }
                mediaCommentListRepository = jn5.A05;
                break;
        }
        mediaCommentListRepository.A0K(num);
    }
}
