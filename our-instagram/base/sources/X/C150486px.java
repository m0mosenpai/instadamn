package X;

import android.content.Context;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentManager;
import com.facebook.cameracore.logging.spars.xplatimpl.XplatSparsLogger;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.implementation.AnalyticsLoggerImpl;
import com.instagram.ar.core.voltron.IgArVoltronModuleLoader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.enums.EnumEntries;

/* renamed from: X.6px, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C150486px implements InterfaceC13050lr, InterfaceC13000lm {
    public static final Map A01 = new HashMap<EnumC150506pz, List<String>>() { // from class: X.6py
        {
            EnumC150506pz enumC150506pz = EnumC150506pz.A0a;
            EnumEntries enumEntries = EnumC27091Ti.A02;
            put(enumC150506pz, Arrays.asList(C150666qM.PYTORCH_VOLTRON_MODULE_NAME, "arservicesforhairsegmentation"));
            put(EnumC150506pz.A15, Arrays.asList(C150666qM.PYTORCH_VOLTRON_MODULE_NAME, "arservicesforpersonsegmentation"));
            put(EnumC150506pz.A1G, Arrays.asList("arservicesfortargettracking", C150666qM.PYTORCH_VOLTRON_MODULE_NAME));
            put(EnumC150506pz.A09, Arrays.asList(C150666qM.PYTORCH_VOLTRON_MODULE_NAME, "arservicesforbodytracking"));
            put(EnumC150506pz.A0X, Arrays.asList(C150666qM.PYTORCH_VOLTRON_MODULE_NAME, "arservicesforgenericml"));
            put(EnumC150506pz.A0R, Arrays.asList(C150666qM.PYTORCH_VOLTRON_MODULE_NAME, "arservicesforfacewave"));
            put(EnumC150506pz.A0N, Arrays.asList(C150666qM.PYTORCH_VOLTRON_MODULE_NAME, "arservicesforexpressionfitting"));
            put(EnumC150506pz.A1I, Arrays.asList("arservicesforruntimerigmapping"));
            put(EnumC150506pz.A0c, Arrays.asList(C150666qM.PYTORCH_VOLTRON_MODULE_NAME, "arservicesforhandtracking"));
            put(EnumC150506pz.A0s, Arrays.asList("arservicesfortargettracking"));
            put(EnumC150506pz.A1c, Arrays.asList("arservicesforwolf"));
            put(EnumC150506pz.A1X, Arrays.asList("arservicesforunifiedtargettracking", "slam"));
            put(EnumC150506pz.A1f, Arrays.asList("slam"));
            put(EnumC150506pz.A1F, Arrays.asList("arservicesforrecognition", "arservicesfortargettracking", C150666qM.PYTORCH_VOLTRON_MODULE_NAME));
        }
    };
    public final C150686qP A00;

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
    }

    public C150486px(Context context, InterfaceC150356pk interfaceC150356pk, AbstractC12990ll abstractC12990ll, Executor executor) {
        EnumC150606qD enumC150606qD;
        Map hashMap;
        C150526q1 A00 = C150526q1.A00(abstractC12990ll);
        if (!IgNetworkConsentManager.sStaticLoaded) {
            XplatSparsLogger.initHybrid();
        } else {
            C150556q8 c150556q8 = new C150556q8(abstractC12990ll);
            c150556q8.EW7(null, "", "", "", null, null, null, false);
            int BP5 = (int) new C150586qB(abstractC12990ll).BP5(C05F.A0A, 0L);
            if (BP5 != 1) {
                if (BP5 != 2) {
                    enumC150606qD = EnumC150606qD.USE_DEFAULT;
                } else {
                    enumC150606qD = EnumC150606qD.OVERRIDE_DISABLE_OPTIMIZED;
                }
            } else {
                enumC150606qD = EnumC150606qD.OVERRIDE_ENABLE_OPTIMIZED;
            }
            C150626qG c150626qG = new C150626qG(new AnalyticsLoggerImpl(c150556q8, null, enumC150606qD));
            C150646qJ c150646qJ = XplatSparsLogger.Companion;
            C150646qJ.A00(c150626qG);
        }
        C150586qB c150586qB = new C150586qB(abstractC12990ll);
        if (AbstractC14490oL.A0C(context)) {
            hashMap = A01;
        } else {
            hashMap = new HashMap();
        }
        this.A00 = new C150686qP(context, A00, new C150666qM(c150586qB, hashMap), interfaceC150356pk, C006802i.A0p, IgArVoltronModuleLoader.getInstance(abstractC12990ll), abstractC12990ll, executor);
    }

    public final C150156pL A00(InterfaceC142616cN interfaceC142616cN) {
        C150686qP c150686qP = this.A00;
        if (c150686qP.A0B == null) {
            C150686qP.A00(c150686qP);
        }
        C150156pL c150156pL = c150686qP.A0B;
        c150156pL.getClass();
        c150156pL.A04(interfaceC142616cN);
        return c150686qP.A0B;
    }
}
