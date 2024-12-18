package com.instagram.creation.capture.quickcapture.sundial.template.suggestion;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C05A;
import X.C06090Tz;
import X.C0eB;
import X.C185158Jg;
import X.C185238Jo;
import X.C18U;
import X.C1JX;
import X.C211999aQ;
import X.C38321qM;
import X.EnumC185548Kw;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.capture.quickcapture.sundial.template.suggestion.repository.ClipsTemplateSuggestionRepository;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.capture.quickcapture.sundial.template.suggestion.ClipsTemplateSuggestionViewModel$setTemplateSuggestionByAudioTrack$1", f = "ClipsTemplateSuggestionViewModel.kt", i = {}, l = {64}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class ClipsTemplateSuggestionViewModel$setTemplateSuggestionByAudioTrack$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ ImageUrl A01;
    public final /* synthetic */ C185158Jg A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClipsTemplateSuggestionViewModel$setTemplateSuggestionByAudioTrack$1(ImageUrl imageUrl, C185158Jg c185158Jg, String str, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        super(2, interfaceC23621Ds);
        this.A01 = imageUrl;
        this.A02 = c185158Jg;
        this.A03 = str;
        this.A04 = z;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new ClipsTemplateSuggestionViewModel$setTemplateSuggestionByAudioTrack$1(this.A01, this.A02, this.A03, interfaceC23621Ds, this.A04);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C05A c05a;
        Object obj2;
        Object obj3 = obj;
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            ImageUrl imageUrl = this.A01;
            if (imageUrl != null) {
                C185158Jg c185158Jg = this.A02;
                UserSession userSession = c185158Jg.A00;
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, userSession, 36316637137277492L)) {
                    c185158Jg.A02.Egh(new C211999aQ(EnumC185548Kw.A08, imageUrl, null, this.A03, this.A04));
                    return C0eB.A00;
                }
                if (C18U.A06(c06090Tz, userSession, 36316637137211955L)) {
                    ClipsTemplateSuggestionRepository clipsTemplateSuggestionRepository = (ClipsTemplateSuggestionRepository) c185158Jg.A01.getValue();
                    String str = this.A03;
                    this.A00 = 1;
                    obj3 = clipsTemplateSuggestionRepository.A00(str, this);
                    if (obj3 == c1jx) {
                        return c1jx;
                    }
                }
            }
            c05a = this.A02.A02;
            obj2 = C185238Jo.A00;
            c05a.Egh(obj2);
            return C0eB.A00;
        }
        C38321qM c38321qM = (C38321qM) obj3;
        if (c38321qM != null && c38321qM.A6J()) {
            c05a = this.A02.A02;
            obj2 = new C211999aQ(EnumC185548Kw.A07, this.A01, c38321qM, this.A03, this.A04);
            c05a.Egh(obj2);
            return C0eB.A00;
        }
        c05a = this.A02.A02;
        obj2 = C185238Jo.A00;
        c05a.Egh(obj2);
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ClipsTemplateSuggestionViewModel$setTemplateSuggestionByAudioTrack$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
