package X;

import android.content.Context;
import android.graphics.Typeface;
import com.instagram.aistudio.deeplink.UGCThreadUrlHandlerActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher;
import com.instagram.leadads.activity.LeadAdsActivity;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
public final class MBY extends AbstractC23611Dp implements InterfaceC16620sF {
    public Object A00;
    public final int A01;
    public final Object A02;
    public final String A03;
    public final String A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MBY(Object obj, String str, String str2, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A01 = i;
        this.A02 = obj;
        this.A04 = str;
        this.A03 = str2;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        Object obj3;
        String str;
        String str2;
        int i;
        Object obj4;
        String str3;
        String str4;
        int i2;
        switch (this.A01) {
            case 0:
                obj3 = this.A00;
                obj2 = this.A02;
                str2 = this.A03;
                str = this.A04;
                i = 0;
                break;
            case 1:
                obj3 = this.A00;
                obj2 = this.A02;
                str2 = this.A03;
                str = this.A04;
                i = 1;
                break;
            case 2:
                obj2 = this.A02;
                obj3 = this.A00;
                str = this.A04;
                str2 = this.A03;
                i = 2;
                break;
            case 3:
                obj4 = this.A02;
                str3 = this.A04;
                str4 = this.A03;
                i2 = 3;
                MBY mby = new MBY(obj4, str3, str4, interfaceC23621Ds, i2);
                mby.A00 = obj;
                return mby;
            case 4:
                obj4 = this.A02;
                str3 = this.A04;
                str4 = this.A03;
                i2 = 4;
                MBY mby2 = new MBY(obj4, str3, str4, interfaceC23621Ds, i2);
                mby2.A00 = obj;
                return mby2;
            case 5:
                obj4 = this.A02;
                str3 = this.A04;
                str4 = this.A03;
                i2 = 5;
                MBY mby22 = new MBY(obj4, str3, str4, interfaceC23621Ds, i2);
                mby22.A00 = obj;
                return mby22;
            default:
                obj4 = this.A02;
                str3 = this.A04;
                str4 = this.A03;
                i2 = 6;
                MBY mby222 = new MBY(obj4, str3, str4, interfaceC23621Ds, i2);
                mby222.A00 = obj;
                return mby222;
        }
        return new MBY(obj3, obj2, str2, str, interfaceC23621Ds, i);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        long j;
        Long A0j;
        Long A0j2;
        switch (this.A01) {
            case 0:
                AbstractC09560e7.A00(obj);
                Iterator A16 = AbstractC166997dE.A16(((SQ2) this.A00).A0A);
                while (A16.hasNext()) {
                    SH9 sh9 = (SH9) A16.next();
                    Context context = (Context) this.A02;
                    C14360o3.A05(sh9);
                    String str = this.A03;
                    String str2 = this.A04;
                    StringBuilder A1C = AbstractC166987dD.A1C();
                    A1C.append((Object) str);
                    A1C.append((Object) sh9.A01);
                    try {
                        Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), AbstractC166997dE.A0x(str2, A1C));
                        C14360o3.A07(createFromAsset);
                        String str3 = sh9.A03;
                        C14360o3.A07(str3);
                        int i = 0;
                        boolean A0a = AbstractC001900j.A0a(str3, "Italic", false);
                        boolean A0a2 = AbstractC001900j.A0a(str3, "Bold", false);
                        if (A0a) {
                            i = 2;
                            if (A0a2) {
                                i = 3;
                            }
                        } else if (A0a2) {
                            i = 1;
                        }
                        if (createFromAsset.getStyle() != i) {
                            createFromAsset = Typeface.create(createFromAsset, i);
                        }
                        sh9.A00 = createFromAsset;
                    } catch (Exception unused) {
                    }
                }
                break;
            case 1:
                AbstractC09560e7.A00(obj);
                AiAgentThreadLauncher aiAgentThreadLauncher = new AiAgentThreadLauncher((UserSession) this.A00);
                UGCThreadUrlHandlerActivity uGCThreadUrlHandlerActivity = (UGCThreadUrlHandlerActivity) this.A02;
                aiAgentThreadLauncher.A05(uGCThreadUrlHandlerActivity, uGCThreadUrlHandlerActivity, AbstractC25225BEi.A0t(""), "", null, this.A03, this.A04);
                uGCThreadUrlHandlerActivity.finish();
                break;
            case 2:
                AbstractC09560e7.A00(obj);
                AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A02;
                InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) this.A00;
                String str4 = this.A04;
                String str5 = this.A03;
                AbstractC167017dG.A1N(abstractC12990ll, interfaceC11380iw);
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, abstractC12990ll), "barcelona_follow_button_tap_prompt_impression");
                if (A0f.isSampled()) {
                    long j2 = 0;
                    if (str4 != null && (A0j2 = AbstractC166997dE.A0j(str4)) != null) {
                        j = A0j2.longValue();
                    } else {
                        j = 0;
                    }
                    A0f.A9K("target_id", Long.valueOf(j));
                    AbstractC37301Gc2.A15(A0f, interfaceC11380iw);
                    if (str5 != null) {
                        AtomicBoolean atomicBoolean = C38321qM.A0i;
                        String A06 = C38801rC.A06(str5);
                        if (A06 != null && (A0j = AbstractC166997dE.A0j(A06)) != null) {
                            j2 = A0j.longValue();
                        }
                    }
                    AbstractC25230BEn.A1B(A0f, j2);
                    AbstractC37302Gc3.A0t(A0f);
                    A0f.Cht();
                    break;
                }
                break;
            case 3:
                AbstractC09560e7.A00(obj);
                AbstractC166987dD.A1Z(new MBX(this.A02, this.A03, this.A04, (InterfaceC23621Ds) null, 4), (C19L) this.A00);
                break;
            case 4:
                AbstractC09560e7.A00(obj);
                C19L c19l = (C19L) this.A00;
                Object obj2 = this.A02;
                String str6 = this.A04;
                String str7 = this.A03;
                Integer num = C05F.A00;
                AbstractC23641Du.A03(num, AnonymousClass191.A00, new C50125MBz(obj2, num, str6, str7, null, 5), c19l);
                break;
            case 5:
                AbstractC09560e7.A00(obj);
                Map map = (Map) this.A00;
                Jn2 jn2 = (Jn2) this.A02;
                C6C9 A00 = Jn2.A00((C45052Jwh) map.get(this.A04), jn2);
                if (A00 != null) {
                    Jn2.A02(A00, jn2);
                    break;
                } else if (!C14360o3.A0K(jn2.A06.getValue(), C45839KQu.A00)) {
                    Jn2.A03(jn2);
                    break;
                }
                break;
            default:
                AbstractC09560e7.A00(obj);
                C38321qM c38321qM = (C38321qM) this.A00;
                if (c38321qM != null) {
                    LeadAdsActivity leadAdsActivity = (LeadAdsActivity) this.A02;
                    String str8 = this.A04;
                    String str9 = this.A03;
                    LeadAdsActivity.A01(c38321qM, leadAdsActivity);
                    String str10 = leadAdsActivity.A02;
                    if (str10 == null) {
                        C14360o3.A0F("formId");
                        throw C00O.createAndThrow();
                    }
                    LeadAdsActivity.A00(AbstractC166987dD.A0r(leadAdsActivity.A0A), leadAdsActivity, str10, str8, str9, false);
                    break;
                }
                break;
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MBY) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MBY(Object obj, Object obj2, String str, String str2, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A01 = i;
        this.A00 = obj;
        this.A02 = obj2;
        this.A03 = str;
        this.A04 = str2;
    }
}
