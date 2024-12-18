package com.aiplatform.modelloaders.nativemodelloader.ig;

import X.AbstractC23641Du;
import X.AnonymousClass191;
import X.AnonymousClass194;
import X.C05F;
import X.C12M;
import X.C14360o3;
import X.C19K;
import X.C8E7;
import X.C8E8;
import X.C8E9;
import X.C8EA;
import X.C9D0;
import X.InterfaceC16660sJ;
import X.InterfaceC23621Ds;
import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class IgVoltronModelLoader {
    public static final C8E7 Companion = new Object();
    public static final String TAG = "IgVoltronModelLoader";
    public final AtomicBoolean areExecuTorchLibrariesLoaded;
    public final AtomicBoolean arePytorchLibrariesLoaded;
    public final AtomicBoolean areSentencePieceLibrariesLoaded;
    public final UserSession userSession;

    public /* synthetic */ IgVoltronModelLoader(UserSession userSession, DefaultConstructorMarker defaultConstructorMarker) {
        this(userSession);
    }

    public final void fetchExecuTorchVoltronModule(InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(interfaceC16660sJ, 0);
        C19K A02 = AnonymousClass194.A02(new C12M().AOT(497892810, 3));
        C9D0 c9d0 = new C9D0(this, interfaceC16660sJ, (InterfaceC23621Ds) null, 3);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9d0, A02);
    }

    public final void fetchPytorchVoltronModule(InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(interfaceC16660sJ, 0);
        C19K A02 = AnonymousClass194.A02(new C12M().AOT(497892810, 3));
        C9D0 c9d0 = new C9D0(this, interfaceC16660sJ, (InterfaceC23621Ds) null, 4);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9d0, A02);
    }

    public final void fetchSentencePieceVoltronModule(InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(interfaceC16660sJ, 0);
        C19K A02 = AnonymousClass194.A02(new C12M().AOT(497892810, 3));
        C9D0 c9d0 = new C9D0(this, interfaceC16660sJ, (InterfaceC23621Ds) null, 5);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9d0, A02);
    }

    public static /* synthetic */ void fetchExecuTorchVoltronModule$default(IgVoltronModelLoader igVoltronModelLoader, InterfaceC16660sJ interfaceC16660sJ, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC16660sJ = C8E9.A00;
        }
        igVoltronModelLoader.fetchExecuTorchVoltronModule(interfaceC16660sJ);
    }

    public static /* synthetic */ void fetchPytorchVoltronModule$default(IgVoltronModelLoader igVoltronModelLoader, InterfaceC16660sJ interfaceC16660sJ, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC16660sJ = C8E8.A00;
        }
        igVoltronModelLoader.fetchPytorchVoltronModule(interfaceC16660sJ);
    }

    public static /* synthetic */ void fetchSentencePieceVoltronModule$default(IgVoltronModelLoader igVoltronModelLoader, InterfaceC16660sJ interfaceC16660sJ, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC16660sJ = C8EA.A00;
        }
        igVoltronModelLoader.fetchSentencePieceVoltronModule(interfaceC16660sJ);
    }

    public static final synchronized IgVoltronModelLoader getInstance(UserSession userSession) {
        IgVoltronModelLoader A00;
        synchronized (IgVoltronModelLoader.class) {
            A00 = Companion.A00(userSession);
        }
        return A00;
    }

    public final void fetchAllModules() {
        fetchPytorchVoltronModule(C8E8.A00);
        fetchExecuTorchVoltronModule(C8E9.A00);
        fetchSentencePieceVoltronModule(C8EA.A00);
    }

    public final AtomicBoolean getAreExecuTorchLibrariesLoaded() {
        return this.areExecuTorchLibrariesLoaded;
    }

    public final AtomicBoolean getArePytorchLibrariesLoaded() {
        return this.arePytorchLibrariesLoaded;
    }

    public final AtomicBoolean getAreSentencePieceLibrariesLoaded() {
        return this.areSentencePieceLibrariesLoaded;
    }

    public IgVoltronModelLoader(UserSession userSession) {
        this.userSession = userSession;
        this.arePytorchLibrariesLoaded = new AtomicBoolean(false);
        this.areExecuTorchLibrariesLoaded = new AtomicBoolean(false);
        this.areSentencePieceLibrariesLoaded = new AtomicBoolean(false);
    }
}
