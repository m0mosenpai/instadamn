package X;

import com.google.common.collect.ImmutableList;
import com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Ons, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55667Ons implements InterfaceC48192Ji {
    public final /* synthetic */ CVK A00;
    public final /* synthetic */ Map A01;
    public final /* synthetic */ C15100pQ A02;
    public final /* synthetic */ C15100pQ A03;
    public final /* synthetic */ InterfaceC71543Iw A04;

    public C55667Ons(CVK cvk, Map map, C15100pQ c15100pQ, C15100pQ c15100pQ2, InterfaceC71543Iw interfaceC71543Iw) {
        this.A02 = c15100pQ;
        this.A03 = c15100pQ2;
        this.A04 = interfaceC71543Iw;
        this.A00 = cvk;
        this.A01 = map;
    }

    @Override // X.InterfaceC48192Ji
    public final void invoke(AnonymousClass436 anonymousClass436) {
        GetCreatorInspirationHubQueryResponseImpl getCreatorInspirationHubQueryResponseImpl;
        int i;
        C2JS c2js;
        GetCreatorInspirationHubQueryResponseImpl.XdtAsyncGetCreatorInspirationHub A0E;
        ImmutableList A0E2;
        GetCreatorInspirationHubQueryResponseImpl.XdtAsyncGetCreatorInspirationHub A0E3;
        ImmutableList A0F;
        GetCreatorInspirationHubQueryResponseImpl.XdtAsyncGetCreatorInspirationHub A0E4;
        ImmutableList A0E5;
        String str = null;
        if (anonymousClass436 != null) {
            getCreatorInspirationHubQueryResponseImpl = (GetCreatorInspirationHubQueryResponseImpl) anonymousClass436.Bos();
        } else {
            getCreatorInspirationHubQueryResponseImpl = null;
        }
        C15100pQ c15100pQ = this.A02;
        if (getCreatorInspirationHubQueryResponseImpl != null && (A0E4 = getCreatorInspirationHubQueryResponseImpl.A0E()) != null && (A0E5 = A0E4.A0E()) != null) {
            i = A0E5.size();
        } else {
            i = 0;
        }
        c15100pQ.A00 = i;
        if (i == 0) {
            if (getCreatorInspirationHubQueryResponseImpl != null && (A0E3 = getCreatorInspirationHubQueryResponseImpl.A0E()) != null && (A0F = A0E3.A0F()) != null) {
                Map map = this.A01;
                ArrayList A0q = AbstractC167017dG.A0q(A0F);
                Iterator<E> it = A0F.iterator();
                while (it.hasNext()) {
                    GetCreatorInspirationHubQueryResponseImpl.XdtAsyncGetCreatorInspirationHub.Sections sections = (GetCreatorInspirationHubQueryResponseImpl.XdtAsyncGetCreatorInspirationHub.Sections) it.next();
                    String requiredStringField = sections.getRequiredStringField(2, "section_id");
                    AbstractC25225BEi.A1S(requiredStringField);
                    map.put(requiredStringField, new C51761Mtk(sections));
                    A0q.add(C0eB.A00);
                }
            }
        } else {
            if (getCreatorInspirationHubQueryResponseImpl != null && (A0E = getCreatorInspirationHubQueryResponseImpl.A0E()) != null && (A0E2 = A0E.A0E()) != null) {
                c2js = (C2JS) AbstractC001800i.A0L(A0E2);
            } else {
                c2js = null;
            }
            Map map2 = this.A01;
            if (c2js != null) {
                str = c2js.getRequiredStringField(2, "section_id");
                AbstractC25225BEi.A1S(str);
            }
            C51761Mtk c51761Mtk = (C51761Mtk) map2.get(str);
            if (c51761Mtk != null) {
                c51761Mtk.A00 = c2js;
            }
        }
        C15100pQ c15100pQ2 = this.A03;
        int i2 = c15100pQ2.A00;
        if (i2 < c15100pQ.A00) {
            c15100pQ2.A00 = i2 + 1;
            this.A04.F8s(getCreatorInspirationHubQueryResponseImpl);
        } else {
            this.A00.A00();
            AnonymousClass194.A04("Streaming termination response received", this.A04);
        }
    }
}
