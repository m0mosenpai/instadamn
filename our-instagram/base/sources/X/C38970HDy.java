package X;

import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.instagram.api.schemas.MediaPromptPrefType;
import com.instagram.api.schemas.PromptFirstMediaType;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.interactive.prompt.pivot.repository.PromptPivotPageRepository;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.List;

/* renamed from: X.HDy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38970HDy extends AbstractC116895Qv {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C38970HDy(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj;
        this.A02 = obj2;
        this.A01 = obj3;
    }

    public static void A00(C38970HDy c38970HDy, Collection collection) {
        List list = (List) c38970HDy.A02;
        list.addAll(collection);
        InterfaceC24741Ir interfaceC24741Ir = (InterfaceC24741Ir) c38970HDy.A01;
        if (!interfaceC24741Ir.CRR()) {
            interfaceC24741Ir.F8s(list);
        }
    }

    @Override // X.AbstractC116895Qv, X.InterfaceC116905Qw
    public final void D5E(C38971HDz c38971HDz) {
        switch (this.A00) {
            case 1:
                List list = (List) this.A02;
                list.clear();
                InterfaceC24741Ir interfaceC24741Ir = (InterfaceC24741Ir) this.A01;
                if (interfaceC24741Ir.CRR()) {
                    return;
                }
                interfaceC24741Ir.F8s(list);
                return;
            case 2:
                C14360o3.A0B(c38971HDz, 0);
                C27885CQw A00 = CLG.A00(((CTI) this.A03).A03);
                String valueOf = String.valueOf(c38971HDz.A01.A01());
                String A002 = AbstractC58317Pt9.A00(561);
                C14360o3.A0B(valueOf, 1);
                Long l = A00.A00;
                if (l != null) {
                    long longValue = l.longValue();
                    InterfaceC09390do interfaceC09390do = A00.A01;
                    ((UserFlowLoggerImpl) interfaceC09390do.getValue()).flowAnnotate(longValue, "error", valueOf);
                    ((UserFlowLoggerImpl) interfaceC09390do.getValue()).flowEndFail(longValue, A002, valueOf);
                }
                A00.A00 = null;
                return;
            default:
                super.D5E(c38971HDz);
                return;
        }
    }

    @Override // X.AbstractC116895Qv, X.InterfaceC116905Qw
    public final void D5F() {
        if (1 - this.A00 != 0) {
            super.D5F();
        }
    }

    @Override // X.AbstractC116895Qv, X.InterfaceC116905Qw
    public final void D5G(C37752GjR c37752GjR) {
        if (1 - this.A00 != 0) {
            super.D5G(c37752GjR);
        }
    }

    @Override // X.AbstractC116895Qv, X.InterfaceC116905Qw
    public final void D5H(C37818GkY c37818GkY) {
        String str;
        String str2;
        ImageUrl imageUrl;
        Object value;
        ImageUrl imageUrl2;
        Object value2;
        MediaPromptPrefType mediaPromptPrefType;
        C38321qM c38321qM;
        User user;
        String str3;
        String str4;
        ImageUrl A0t;
        Object value3;
        String str5;
        ImageUrl A0t2;
        C38321qM c38321qM2;
        User A2E;
        C27885CQw A00;
        Long l;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(c37818GkY, 0);
                PromptPivotPageRepository promptPivotPageRepository = (PromptPivotPageRepository) this.A03;
                C38964HDs c38964HDs = promptPivotPageRepository.A02;
                InterfaceC124295jj interfaceC124295jj = c37818GkY.A01;
                C124275jh c124275jh = (C124275jh) interfaceC124295jj;
                c38964HDs.A02(c124275jh.BbA());
                List A002 = AbstractC37761Gja.A00(promptPivotPageRepository.A01, promptPivotPageRepository.A00.getModuleName(), c37818GkY.A09);
                boolean z = c37818GkY.A0D;
                if (z) {
                    ((List) this.A02).clear();
                    C38957HDj c38957HDj = (C38957HDj) interfaceC124295jj;
                    String str6 = c38957HDj.A05;
                    if (str6 != null) {
                        PromptFirstMediaType promptFirstMediaType = c38957HDj.A02;
                        ImageUrl imageUrl3 = null;
                        if (promptFirstMediaType != null && promptFirstMediaType != PromptFirstMediaType.A04 && (user = c38957HDj.A03) != null) {
                            str2 = user.getUsername();
                        } else {
                            str2 = null;
                        }
                        User user2 = c38957HDj.A03;
                        if (user2 != null) {
                            imageUrl = user2.Bhu();
                        } else {
                            imageUrl = null;
                        }
                        String str7 = c38957HDj.A04;
                        if (str7 != null) {
                            PromptFirstMediaType promptFirstMediaType2 = c38957HDj.A02;
                            if (promptFirstMediaType2 != null && promptFirstMediaType2 != PromptFirstMediaType.A04 && AbstractC166987dD.A1b(A002) && (c38321qM = ((C120985dq) A002.get(0)).A02) != null) {
                                imageUrl3 = c38321qM.A1S();
                            }
                            C05A c05a = promptPivotPageRepository.A06;
                            do {
                                value = c05a.getValue();
                                if (imageUrl3 == null) {
                                    imageUrl2 = AbstractC25225BEi.A0t("");
                                } else {
                                    imageUrl2 = imageUrl3;
                                }
                            } while (!c05a.AIi(value, new C26029BfI(null, null, null, imageUrl, imageUrl2, false, str6, str2, str7, false)));
                            C05A c05a2 = promptPivotPageRepository.A03;
                            while (true) {
                                Object value4 = c05a2.getValue();
                                MediaPromptPrefType mediaPromptPrefType2 = c38957HDj.A00;
                                if (mediaPromptPrefType2 != null) {
                                    if (c05a2.AIi(value4, mediaPromptPrefType2)) {
                                        C05A c05a3 = promptPivotPageRepository.A08;
                                        do {
                                            value2 = c05a3.getValue();
                                            mediaPromptPrefType = c38957HDj.A01;
                                            if (mediaPromptPrefType == null) {
                                                str = "notificationSetting";
                                            }
                                        } while (!c05a3.AIi(value2, mediaPromptPrefType));
                                        C05A c05a4 = promptPivotPageRepository.A04;
                                        do {
                                        } while (!c05a4.AIi(c05a4.getValue(), c38957HDj.A02));
                                    }
                                } else {
                                    str = "authorAttributionSetting";
                                }
                            }
                        } else {
                            str = "formattedMediaCount";
                        }
                    } else {
                        str = "promptStickerText";
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                C05A c05a5 = promptPivotPageRepository.A05;
                do {
                } while (!c05a5.AIi(c05a5.getValue(), Boolean.valueOf(c124275jh.BbA().BUt())));
                C05A c05a6 = promptPivotPageRepository.A07;
                do {
                } while (!c05a6.AIi(c05a6.getValue(), Boolean.valueOf(z)));
                A00(this, A002);
                return;
            case 1:
                C14360o3.A0B(c37818GkY, 0);
                CT7 ct7 = (CT7) this.A03;
                C26913BuG c26913BuG = ct7.A00;
                C124275jh c124275jh2 = (C124275jh) c37818GkY.A01;
                c26913BuG.A02(c124275jh2.BbA());
                AbstractC166997dE.A1Y(ct7.A03, c124275jh2.BbA().BUt());
                AbstractC166997dE.A1Y(ct7.A04, c37818GkY.A0D);
                A00(this, AbstractC37761Gja.A00(ct7.A02, ct7.A01.getModuleName(), c37818GkY.A09));
                return;
            default:
                C14360o3.A0B(c37818GkY, 0);
                CTI cti = (CTI) this.A03;
                C26913BuG c26913BuG2 = cti.A01;
                InterfaceC124295jj interfaceC124295jj2 = c37818GkY.A01;
                C124275jh c124275jh3 = (C124275jh) interfaceC124295jj2;
                c26913BuG2.A02(c124275jh3.BbA());
                UserSession userSession = cti.A03;
                List A003 = AbstractC37761Gja.A00(userSession, cti.A02.getModuleName(), c37818GkY.A09);
                boolean z2 = c37818GkY.A0D;
                if (z2) {
                    if (A003.isEmpty() && (l = (A00 = CLG.A00(userSession)).A00) != null) {
                        ((UserFlowLoggerImpl) A00.A01.getValue()).flowAnnotate(l.longValue(), AbstractC111324zv.A00(2608), 1);
                    }
                    C27885CQw A004 = CLG.A00(userSession);
                    Long l2 = A004.A00;
                    if (l2 != null) {
                        ((UserFlowLoggerImpl) A004.A01.getValue()).flowEndSuccess(l2.longValue());
                    }
                    String str8 = null;
                    A004.A00 = null;
                    ((List) this.A02).clear();
                    C38955HDh c38955HDh = (C38955HDh) interfaceC124295jj2;
                    QJ0 qj0 = c38955HDh.A00;
                    ImageInfo imageInfo = null;
                    if (qj0 != null) {
                        str8 = qj0.A04;
                        str3 = qj0.A03;
                        str4 = qj0.A02;
                    } else {
                        str3 = null;
                        str4 = null;
                    }
                    if (!A003.isEmpty() && (c38321qM2 = ((C120985dq) A003.get(0)).A02) != null && (A2E = c38321qM2.A2E(userSession)) != null) {
                        A0t = A2E.Bhu();
                    } else {
                        A0t = AbstractC25225BEi.A0t("");
                    }
                    QJ0 qj02 = c38955HDh.A00;
                    if (qj02 != null) {
                        imageInfo = (ImageInfo) qj02.A00;
                    }
                    C05A c05a7 = cti.A05;
                    do {
                        value3 = c05a7.getValue();
                        if (str8 == null) {
                            str5 = AbstractC166997dE.A0p(cti.A00, 2131975267);
                        } else {
                            str5 = str8;
                        }
                        if (imageInfo == null || (A0t2 = AbstractC40161tk.A02(imageInfo)) == null) {
                            A0t2 = AbstractC25225BEi.A0t("");
                        }
                    } while (!c05a7.AIi(value3, new C26029BfI(null, null, null, A0t, A0t2, false, str5, str3, str4, false)));
                }
                C05A c05a8 = cti.A04;
                do {
                } while (!c05a8.AIi(c05a8.getValue(), Boolean.valueOf(c124275jh3.BbA().BUt())));
                C05A c05a9 = cti.A06;
                do {
                } while (!c05a9.AIi(c05a9.getValue(), Boolean.valueOf(z2)));
                A00(this, A003);
                return;
        }
    }
}
