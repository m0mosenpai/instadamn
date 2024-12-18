package X;

import android.app.Dialog;
import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.instagram.bugreporter.BugReportComposerViewModel;
import com.instagram.bugreporter.model.BugReport;
import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;
import com.instagram.upcomingevents.common.model.UpcomingEventReminderAction;
import com.instagram.user.model.UpcomingEvent;
import java.util.List;

/* loaded from: classes7.dex */
public final class HGH extends C1P1 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    public HGH(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.A00 = i;
        this.A03 = obj;
        this.A04 = obj5;
        this.A02 = obj4;
        this.A06 = obj2;
        this.A05 = obj3;
        this.A01 = obj6;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N;
        String str;
        C51544MpU c51544MpU;
        Boolean bool;
        Boolean bool2;
        int i;
        C51570Mpu c51570Mpu;
        String str2;
        EnumC39559HdV enumC39559HdV;
        String str3;
        int i2;
        switch (this.A00) {
            case 0:
                A0N = AbstractC167017dG.A0N(abstractC115105If, 968635188);
                String str4 = null;
                if (abstractC115105If instanceof C115115Ig) {
                    Throwable A01 = abstractC115105If.A01();
                    if (A01 == null) {
                        str = "ApiError.error is null";
                    } else if (!(A01 instanceof VI9)) {
                        str = "ApiError.error is not a GraphQLException";
                    } else {
                        String A00 = AbstractC58317Pt9.A00(118);
                        C14360o3.A0C(A01, A00);
                        ImmutableList immutableList = ((VI9) A01).A00;
                        if (immutableList.isEmpty()) {
                            str = "ApiError.error.errors is empty";
                        } else {
                            C14360o3.A0C(A01, A00);
                            C1LC it = immutableList.iterator();
                            C14360o3.A07(it);
                            str = null;
                            while (it.hasNext()) {
                                InterfaceC65563Tmj interfaceC65563Tmj = (InterfaceC65563Tmj) AbstractC166997dE.A0l(it);
                                if (interfaceC65563Tmj.getDescription() != null) {
                                    if (str == null) {
                                        str = interfaceC65563Tmj.getDescription();
                                    } else {
                                        str = AnonymousClass001.A0g(str, " | ", interfaceC65563Tmj.getDescription());
                                    }
                                }
                            }
                            if (str == null) {
                                str = "IGraphQLError.description is unavailable.";
                            }
                        }
                    }
                } else {
                    Throwable A012 = abstractC115105If.A01();
                    if (A012 == null || (str = A012.toString()) == null) {
                        str = "ApiError unavailable. Device is likely offline";
                    }
                }
                C55203OeE.A03((Context) this.A03, (BugReportComposerViewModel) this.A06, (BugReport) this.A02, (AbstractC12990ll) this.A04, true);
                AnonymousClass435 anonymousClass435 = (AnonymousClass435) abstractC115105If.A00();
                if (anonymousClass435 != null && (c51570Mpu = (C51570Mpu) anonymousClass435.A01) != null) {
                    c51544MpU = c51570Mpu.A07();
                } else {
                    c51544MpU = null;
                }
                OIN oin = (OIN) this.A05;
                if (c51544MpU != null) {
                    bool = Boolean.valueOf(c51544MpU.A06("is_retryable"));
                    bool2 = Boolean.valueOf(c51544MpU.A06("is_prohibited"));
                    str4 = c51544MpU.A05("error_message");
                } else {
                    bool = null;
                    bool2 = null;
                }
                oin.A00(bool, bool2, str, str4);
                i = 387362835;
                break;
            case 1:
                A0N = AbstractC167017dG.A0N(abstractC115105If, -501021254);
                super.onFail(abstractC115105If);
                C70399WUb.A00((UserSession) this.A06).A0M(VG4.A0o, "promote_tooltip_fetch", abstractC115105If.A01());
                i = -1141943835;
                break;
            case 2:
                A0N = AbstractC167017dG.A0N(abstractC115105If, -929170349);
                ((Dialog) this.A02).dismiss();
                C9GR.A0C((Context) this.A01, "hideSuperlativeCard_unknown_error_occured");
                Throwable A013 = abstractC115105If.A01();
                if (A013 == null || (str2 = A013.getMessage()) == null) {
                    str2 = "";
                }
                C37947Gmp.A01("Menu Click", AnonymousClass001.A0R("Delete API failed - ", str2));
                ((InterfaceC1118853a) this.A04).EJJ();
                i = 983618050;
                break;
            case 3:
                A0N = C0f9.A03(-127262819);
                AbstractC35260Fgu.A03((Context) this.A03, (InterfaceC11380iw) this.A01, (UserSession) this.A06, (SavedCollection) this.A02, (Runnable) this.A05, (List) this.A04);
                i = -1417359824;
                break;
            default:
                A0N = AbstractC167017dG.A0N(abstractC115105If, 1744190793);
                super.onFail(abstractC115105If);
                IMX imx = (IMX) this.A06;
                C146086i6 c146086i6 = imx.A08;
                INM inm = (INM) this.A04;
                if (inm.A01() == UpcomingEventReminderAction.A04) {
                    enumC39559HdV = EnumC39559HdV.A03;
                } else {
                    enumC39559HdV = EnumC39559HdV.A04;
                }
                Throwable A014 = abstractC115105If.A01();
                String str5 = null;
                if (A014 != null) {
                    str3 = A014.getMessage();
                } else {
                    str3 = null;
                }
                c146086i6.A01(enumC39559HdV, str3);
                C146076i5 c146076i5 = imx.A07;
                UpcomingEvent upcomingEvent = (UpcomingEvent) this.A01;
                C38321qM c38321qM = (C38321qM) this.A02;
                if (c38321qM != null) {
                    str5 = c38321qM.getId();
                }
                C41111IIc c41111IIc = (C41111IIc) this.A03;
                if (c41111IIc.A03) {
                    i2 = 5538;
                } else {
                    i2 = 5537;
                }
                c146076i5.A04(upcomingEvent, str5, AbstractC111324zv.A00(i2), c41111IIc.A02);
                if (abstractC115105If instanceof C115115Ig) {
                    imx.A06.A0N(inm);
                    imx.A03.E4s(new C42242InS(upcomingEvent));
                    IN8 in8 = (IN8) this.A05;
                    if (in8 != null) {
                        in8.A00();
                    }
                    JHY jhy = imx.A00;
                    if (jhy != null) {
                        jhy.DG1(upcomingEvent);
                    }
                }
                i = 1106112941;
                break;
        }
        C0f9.A0A(i, A0N);
    }

    @Override // X.C1P1
    public final void onStart() {
        if (2 - this.A00 != 0) {
            super.onStart();
            return;
        }
        int A03 = C0f9.A03(1882400984);
        C0fJ.A00((Dialog) this.A02);
        C0f9.A0A(1929668787, A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x02dc, code lost:
    
        if (r10 != null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0327, code lost:
    
        if (r10 != null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0323, code lost:
    
        if (r10 != null) goto L69;
     */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 930
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HGH.onSuccess(java.lang.Object):void");
    }
}
