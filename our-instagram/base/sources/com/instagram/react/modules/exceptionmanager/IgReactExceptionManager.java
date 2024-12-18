package com.instagram.react.modules.exceptionmanager;

import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC58318PtA;
import X.AbstractC58322PtE;
import X.C0w9;
import X.C14360o3;
import X.C27431Uw;
import X.C62800SRu;
import X.C62815SSm;
import X.C63089Scp;
import X.C63255SgD;
import X.C64489TFz;
import X.InterfaceC65352Tig;
import X.T0G;
import X.TP7;
import com.facebook.fbreact.specs.NativeExceptionsManagerSpec;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.module.annotations.ReactModule;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

@ReactModule(canOverrideExistingModule = true, name = "ExceptionsManager", needsEagerInit = true)
/* loaded from: classes10.dex */
public final class IgReactExceptionManager extends NativeExceptionsManagerSpec implements InterfaceC65352Tig {
    public static final C62815SSm Companion = new Object();
    public static final String MODULE_NAME = "ExceptionsManager";
    public final Set exceptionHandlers;
    public final AbstractC18680vv session;

    public IgReactExceptionManager(AbstractC18680vv abstractC18680vv) {
        super(null);
        this.session = abstractC18680vv;
        this.exceptionHandlers = AbstractC58322PtE.A11();
    }

    public /* synthetic */ IgReactExceptionManager(AbstractC18680vv abstractC18680vv, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC18680vv);
    }

    public static final IgReactExceptionManager getInstance(AbstractC18680vv abstractC18680vv) {
        return C62815SSm.A00(abstractC18680vv);
    }

    public final void addExceptionHandler(InterfaceC65352Tig interfaceC65352Tig) {
        C14360o3.A0B(interfaceC65352Tig, 0);
        this.exceptionHandlers.add(interfaceC65352Tig);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public boolean canOverrideExistingModule() {
        return true;
    }

    @Override // com.facebook.fbreact.specs.NativeExceptionsManagerSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ExceptionsManager";
    }

    @Override // X.InterfaceC65352Tig
    public void handleException(Exception exc) {
        C14360o3.A0B(exc, 0);
        C64489TFz A00 = C27431Uw.A02.A00().A00(this.session);
        if (A00 != null) {
            Set set = this.exceptionHandlers;
            C14360o3.A06(set);
            synchronized (set) {
                if (this.exceptionHandlers.isEmpty()) {
                    if (exc instanceof RuntimeException) {
                        throw exc;
                    }
                    throw AbstractC58318PtA.A0f(exc);
                }
                C0w9.A01.EHm(exc);
                A00.A03();
                C63255SgD.A01(new TP7(exc, AbstractC31171DnF.A0k(this.exceptionHandlers)));
            }
        }
    }

    public final void removeExceptionHandler(InterfaceC65352Tig interfaceC65352Tig) {
        C14360o3.A0B(interfaceC65352Tig, 0);
        this.exceptionHandlers.remove(interfaceC65352Tig);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Throwable, com.facebook.react.common.JavascriptException, java.lang.RuntimeException] */
    @Override // com.facebook.fbreact.specs.NativeExceptionsManagerSpec
    public void reportSoftException(String str, ReadableArray readableArray, double d) {
        AbstractC167007dF.A1K(str, readableArray);
        if (C27431Uw.A02.A00().A00(this.session) != null) {
            ?? runtimeException = new RuntimeException(C63089Scp.A00(str, readableArray));
            runtimeException.extraDataAsJson = C62800SRu.A00(new T0G("isFatal", false));
            C0w9.A01.EHm(runtimeException);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeExceptionsManagerSpec
    public void reportFatalException(String str, ReadableArray readableArray, double d) {
        AbstractC167017dG.A1N(str, readableArray);
        if (C27431Uw.A02.A00().A00(this.session) != null) {
            throw new RuntimeException(C63089Scp.A00(str, readableArray));
        }
    }

    @Override // com.facebook.fbreact.specs.NativeExceptionsManagerSpec
    public void updateExceptionMessage(String str, ReadableArray readableArray, double d) {
        AbstractC167017dG.A1N(str, readableArray);
        C27431Uw.A02.A00().A00(this.session);
    }
}
