package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.direct.messagethread.DirectMessageListLinearLayoutManager;
import com.instagram.direct.model.DirectThreadThemeInfo;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.meta.foa.instagram.performancelogging.navigation.IGFOAMessagingThreadViewNavigationLogger;
import com.meta.foa.instagram.performancelogging.navigation.IGFOAMessagingThreadViewNavigationLoggingController;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;

/* renamed from: X.51B, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C51B extends AbstractC59962oe implements InterfaceC11480j6, InterfaceC72513My {
    public static final String __redex_internal_original_name = "DirectThreadFragment";
    public C7W4 A00;
    public C98N A01;
    public final InterfaceC60442pS A03 = AbstractC60952qJ.A01("direct_thread", true, false);
    public final C7W2 A02 = new C7W2(this);
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        String str;
        C14360o3.A0B(configuration, 0);
        super.onConfigurationChanged(configuration);
        C7W4 c7w4 = this.A00;
        if (c7w4 == null) {
            str = "threadController";
        } else {
            AbstractC59962oe abstractC59962oe = c7w4.A0U;
            if (abstractC59962oe.isAdded()) {
                Configuration configuration2 = abstractC59962oe.requireContext().getResources().getConfiguration();
                C14360o3.A07(configuration2);
                if (AbstractC68606VXh.A00(configuration2, configuration)) {
                    C7IY c7iy = c7w4.A0A;
                    if (c7iy == null) {
                        str = "messageListAdapterHolder";
                    } else {
                        c7iy.AZT().notifyDataSetChanged();
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        String str;
        C14360o3.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        C7W4 c7w4 = this.A00;
        if (c7w4 == null) {
            str = "threadController";
        } else {
            C164197Wi c164197Wi = c7w4.A0j;
            InterfaceC69973Cg interfaceC69973Cg = c164197Wi.A0E.A00;
            if (interfaceC69973Cg != null) {
                interfaceC69973Cg.onSaveInstanceState(bundle);
                String str2 = c7w4.A0H;
                if (str2 == null) {
                    str = "threadViewerSessionId";
                } else {
                    bundle.putString("DirectThreadFragment.ARGUMENT_VIEWER_SESSION_ID", str2);
                    String str3 = c7w4.A0G;
                    if (str3 == null) {
                        str = "expiringMessageReplaySessionId";
                    } else {
                        bundle.putString("DirectInboxFragment.DIRECT_VISUAL_MESSAGE_REPLAY_SESSION_ID", str3);
                        C7U0 c7u0 = c7w4.A08;
                        if (c7u0 == null) {
                            str = "clientInfra";
                        } else {
                            bundle.putBoolean("DirectThreadFragment.ARGUMENT_SHOW_PERMISSIONS", c7u0.C7r().Eje());
                            Capabilities capabilities = c7w4.A06;
                            if (capabilities == null) {
                                str = "_capabilities";
                            } else {
                                bundle.putParcelable("DirectFragment.DIRECT_FRAGMENT_THREAD_CAPABILITIES", capabilities);
                                C47747L6q c47747L6q = c164197Wi.A01;
                                if (c47747L6q != null) {
                                    bundle.putBoolean("DirectThreadFragment.ARGUMENT_PRIVATE_REPLY_SENT", c47747L6q.A00);
                                    return;
                                }
                                return;
                            }
                        }
                    }
                }
            } else {
                str = "captureFlowHelper";
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a7, code lost:
    
        if (r3.A0N == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01bf, code lost:
    
        if (((java.lang.Boolean) r1.A0K.getValue()).booleanValue() == false) goto L81;
     */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r26, android.os.Bundle r27) {
        /*
            Method dump skipped, instructions count: 1055
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51B.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.InterfaceC11480j6
    public final C11520jB E6b() {
        C7W4 c7w4 = this.A00;
        if (c7w4 == null) {
            C14360o3.A0F("threadController");
            throw C00O.createAndThrow();
        }
        return c7w4.E6b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
    
        if (r1 != 62) goto L20;
     */
    @Override // X.InterfaceC11380iw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getModuleName() {
        /*
            r3 = this;
            X.7W4 r2 = r3.A00
            if (r2 == 0) goto L48
            X.7U0 r0 = r2.A08
            if (r0 == 0) goto L2e
            X.7Ux r0 = r0.C7r()
            X.7TT r0 = r0.C7W()
            int r1 = r0.A08
            r0 = 28
            if (r1 == r0) goto L45
            r0 = 29
            if (r1 == r0) goto L42
            r0 = 32
            if (r1 == r0) goto L3b
            r0 = 1012(0x3f4, float:1.418E-42)
            if (r1 == r0) goto L38
            r0 = 1014(0x3f6, float:1.421E-42)
            if (r1 == r0) goto L35
            r0 = 61
            if (r1 == r0) goto L45
            r0 = 62
            if (r1 == r0) goto L3b
        L2e:
            X.2pS r0 = r2.A0y
            java.lang.String r0 = r0.getModuleName()
            return r0
        L35:
            java.lang.String r0 = "ugc_agent_thread"
            return r0
        L38:
            java.lang.String r0 = "agent_thread"
            return r0
        L3b:
            r0 = 944(0x3b0, float:1.323E-42)
            java.lang.String r0 = X.AbstractC43591JPw.A00(r0)
            return r0
        L42:
            java.lang.String r0 = "broadcast_chat_thread"
            return r0
        L45:
            java.lang.String r0 = "csc_direct_thread"
            return r0
        L48:
            X.2pS r0 = r3.A03
            java.lang.String r0 = r0.getModuleName()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51B.getModuleName():java.lang.String");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A04.getValue();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C7W4 c7w4 = this.A00;
        if (c7w4 == null) {
            C14360o3.A0F("threadController");
            throw C00O.createAndThrow();
        }
        c7w4.A0T(i, i2, intent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x0452, code lost:
    
        if (((java.lang.Boolean) r7.A04.get()).booleanValue() == false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0733, code lost:
    
        if (r27.longValue() > (-1)) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0601, code lost:
    
        if (r4.Avk().CWY() == false) goto L211;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x037a A[Catch: all -> 0x0820, TryCatch #0 {all -> 0x0820, blocks: (B:100:0x0376, B:102:0x037a, B:105:0x0391, B:300:0x0389, B:301:0x0390), top: B:99:0x0376, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0362 A[Catch: all -> 0x084e, TryCatch #4 {all -> 0x084e, blocks: (B:12:0x0034, B:14:0x0054, B:15:0x0056, B:17:0x0076, B:18:0x0078, B:21:0x07be, B:23:0x0086, B:24:0x07c6, B:27:0x07cc, B:298:0x084d, B:30:0x0088, B:32:0x008c, B:33:0x0090, B:35:0x00ab, B:37:0x00b0, B:39:0x00cf, B:71:0x0257, B:73:0x025d, B:74:0x0263, B:76:0x026b, B:93:0x035c, B:95:0x0362, B:96:0x0368, B:98:0x0370, B:106:0x0396, B:108:0x039c, B:109:0x03a2, B:111:0x03aa, B:118:0x03bf, B:120:0x03c5, B:121:0x03cb, B:123:0x03cf, B:125:0x03eb, B:127:0x0407, B:129:0x0419, B:131:0x041f, B:133:0x0425, B:135:0x042b, B:136:0x0435, B:138:0x043f, B:140:0x0445, B:142:0x0455, B:144:0x0463, B:146:0x046e, B:148:0x0472, B:149:0x048c, B:151:0x04b9, B:152:0x04bc, B:154:0x04c4, B:156:0x04d6, B:158:0x04dc, B:160:0x04e0, B:161:0x04e4, B:163:0x04ea, B:169:0x04f9, B:171:0x050f, B:173:0x051f, B:174:0x0534, B:176:0x0538, B:178:0x0544, B:180:0x054e, B:182:0x0556, B:184:0x055a, B:185:0x06d1, B:187:0x06d5, B:189:0x06df, B:190:0x06e6, B:192:0x06f0, B:194:0x0704, B:197:0x071a, B:199:0x072b, B:201:0x0735, B:203:0x0741, B:205:0x0760, B:207:0x0773, B:209:0x0779, B:211:0x077f, B:213:0x0785, B:215:0x0789, B:217:0x078f, B:219:0x0793, B:220:0x0796, B:222:0x079c, B:224:0x07a6, B:225:0x0571, B:227:0x0579, B:228:0x0582, B:230:0x05be, B:232:0x05c8, B:234:0x07d2, B:235:0x07d7, B:236:0x07d9, B:237:0x07ea, B:239:0x07f0, B:241:0x07fa, B:246:0x05d8, B:248:0x05f5, B:250:0x05f9, B:252:0x0603, B:254:0x060b, B:256:0x0621, B:258:0x0629, B:259:0x062b, B:261:0x0633, B:263:0x0639, B:264:0x0653, B:266:0x0659, B:268:0x065f, B:270:0x0663, B:276:0x0698, B:282:0x06ac, B:284:0x06b5, B:286:0x06b9, B:288:0x06c3, B:290:0x06ca, B:294:0x0816, B:297:0x084a, B:303:0x0821, B:326:0x082c, B:336:0x0841, B:100:0x0376, B:102:0x037a, B:105:0x0391, B:300:0x0389, B:301:0x0390, B:41:0x00d5, B:43:0x0106, B:45:0x010c, B:47:0x0110, B:49:0x0114, B:51:0x011c, B:53:0x0128, B:54:0x012a, B:59:0x0164, B:60:0x0169, B:62:0x0183, B:63:0x0189, B:66:0x01f3, B:68:0x023b, B:70:0x024a, B:330:0x0252, B:331:0x0836, B:332:0x083f, B:334:0x0151, B:113:0x03b0, B:115:0x03b4, B:116:0x03bb, B:117:0x03bc, B:78:0x0271, B:80:0x0277, B:82:0x028a, B:84:0x029d, B:86:0x02a6, B:89:0x02b2, B:91:0x02bb, B:92:0x0358, B:309:0x02db, B:311:0x02eb, B:313:0x02ef, B:316:0x0305, B:318:0x0319, B:322:0x0330, B:323:0x02fd, B:324:0x0304), top: B:11:0x0034, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0370 A[Catch: all -> 0x084e, TRY_LEAVE, TryCatch #4 {all -> 0x084e, blocks: (B:12:0x0034, B:14:0x0054, B:15:0x0056, B:17:0x0076, B:18:0x0078, B:21:0x07be, B:23:0x0086, B:24:0x07c6, B:27:0x07cc, B:298:0x084d, B:30:0x0088, B:32:0x008c, B:33:0x0090, B:35:0x00ab, B:37:0x00b0, B:39:0x00cf, B:71:0x0257, B:73:0x025d, B:74:0x0263, B:76:0x026b, B:93:0x035c, B:95:0x0362, B:96:0x0368, B:98:0x0370, B:106:0x0396, B:108:0x039c, B:109:0x03a2, B:111:0x03aa, B:118:0x03bf, B:120:0x03c5, B:121:0x03cb, B:123:0x03cf, B:125:0x03eb, B:127:0x0407, B:129:0x0419, B:131:0x041f, B:133:0x0425, B:135:0x042b, B:136:0x0435, B:138:0x043f, B:140:0x0445, B:142:0x0455, B:144:0x0463, B:146:0x046e, B:148:0x0472, B:149:0x048c, B:151:0x04b9, B:152:0x04bc, B:154:0x04c4, B:156:0x04d6, B:158:0x04dc, B:160:0x04e0, B:161:0x04e4, B:163:0x04ea, B:169:0x04f9, B:171:0x050f, B:173:0x051f, B:174:0x0534, B:176:0x0538, B:178:0x0544, B:180:0x054e, B:182:0x0556, B:184:0x055a, B:185:0x06d1, B:187:0x06d5, B:189:0x06df, B:190:0x06e6, B:192:0x06f0, B:194:0x0704, B:197:0x071a, B:199:0x072b, B:201:0x0735, B:203:0x0741, B:205:0x0760, B:207:0x0773, B:209:0x0779, B:211:0x077f, B:213:0x0785, B:215:0x0789, B:217:0x078f, B:219:0x0793, B:220:0x0796, B:222:0x079c, B:224:0x07a6, B:225:0x0571, B:227:0x0579, B:228:0x0582, B:230:0x05be, B:232:0x05c8, B:234:0x07d2, B:235:0x07d7, B:236:0x07d9, B:237:0x07ea, B:239:0x07f0, B:241:0x07fa, B:246:0x05d8, B:248:0x05f5, B:250:0x05f9, B:252:0x0603, B:254:0x060b, B:256:0x0621, B:258:0x0629, B:259:0x062b, B:261:0x0633, B:263:0x0639, B:264:0x0653, B:266:0x0659, B:268:0x065f, B:270:0x0663, B:276:0x0698, B:282:0x06ac, B:284:0x06b5, B:286:0x06b9, B:288:0x06c3, B:290:0x06ca, B:294:0x0816, B:297:0x084a, B:303:0x0821, B:326:0x082c, B:336:0x0841, B:100:0x0376, B:102:0x037a, B:105:0x0391, B:300:0x0389, B:301:0x0390, B:41:0x00d5, B:43:0x0106, B:45:0x010c, B:47:0x0110, B:49:0x0114, B:51:0x011c, B:53:0x0128, B:54:0x012a, B:59:0x0164, B:60:0x0169, B:62:0x0183, B:63:0x0189, B:66:0x01f3, B:68:0x023b, B:70:0x024a, B:330:0x0252, B:331:0x0836, B:332:0x083f, B:334:0x0151, B:113:0x03b0, B:115:0x03b4, B:116:0x03bb, B:117:0x03bc, B:78:0x0271, B:80:0x0277, B:82:0x028a, B:84:0x029d, B:86:0x02a6, B:89:0x02b2, B:91:0x02bb, B:92:0x0358, B:309:0x02db, B:311:0x02eb, B:313:0x02ef, B:316:0x0305, B:318:0x0319, B:322:0x0330, B:323:0x02fd, B:324:0x0304), top: B:11:0x0034, inners: #0, #1, #2, #3 }] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r49) {
        /*
            Method dump skipped, instructions count: 2134
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51B.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        InterfaceC11380iw interfaceC11380iw;
        String str;
        int A02 = C0f9.A02(1446340375);
        C98N c98n = this.A01;
        if (c98n == null) {
            str = "navigationPerfLogger";
        } else {
            ((C98O) c98n).A03.A08(null);
            final C7W4 c7w4 = this.A00;
            if (c7w4 == null) {
                str = "threadController";
            } else {
                AbstractC09800fd.A01("DirectThreadController.onCreateView", 857702404);
                try {
                    C57992lC c57992lC = C57982lB.A0B;
                    AbstractC59962oe abstractC59962oe = c7w4.A0U;
                    Activity rootActivity = abstractC59962oe.getRootActivity();
                    if (rootActivity != null) {
                        boolean z = false;
                        c57992lC.A04(rootActivity, c7w4.A10, false);
                        if (c7w4.A0v == EnumC92794Ds.A04) {
                            interfaceC11380iw = new C19270xB("direct_secure_thread");
                        } else {
                            interfaceC11380iw = c7w4.A0V;
                        }
                        int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                        FragmentActivity requireActivity = abstractC59962oe.requireActivity();
                        UserSession userSession = c7w4.A0d;
                        InterfaceC08830cm interfaceC08830cm = new InterfaceC08830cm() { // from class: X.7Jx
                            /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
                            
                                if (r1.A0F != null) goto L6;
                             */
                            @Override // X.InterfaceC08830cm
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final /* bridge */ /* synthetic */ java.lang.Object get() {
                                /*
                                    r2 = this;
                                    X.7W4 r1 = X.C7W4.this
                                    X.7Wi r0 = r1.A0j
                                    X.7Wk r0 = r0.A0O
                                    boolean r0 = r0.CYr()
                                    if (r0 != 0) goto L11
                                    java.lang.String r1 = r1.A0F
                                    r0 = 0
                                    if (r1 == 0) goto L12
                                L11:
                                    r0 = 1
                                L12:
                                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                                    return r0
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C161127Jx.get():java.lang.Object");
                            }
                        };
                        if (c7w4.A0F != null) {
                            z = true;
                        }
                        C62882tR c62882tR = new C62882tR(requireActivity, interfaceC11380iw, userSession, false, Boolean.valueOf(z), interfaceC08830cm, C161137Jy.A00, new InterfaceC08830cm() { // from class: X.7Jz
                            @Override // X.InterfaceC08830cm
                            public final /* bridge */ /* synthetic */ Object get() {
                                EnumC92794Ds Ay7 = C7W4.this.A0H(true).Ay7();
                                if (Ay7 != null) {
                                    return Ay7.A00;
                                }
                                return null;
                            }
                        }, new InterfaceC08830cm() { // from class: X.7K0
                            @Override // X.InterfaceC08830cm
                            public final /* bridge */ /* synthetic */ Object get() {
                                return C7W4.this.A0N();
                            }
                        }, new InterfaceC08830cm() { // from class: X.7K1
                            @Override // X.InterfaceC08830cm
                            public final /* bridge */ /* synthetic */ Object get() {
                                C7W4 c7w42 = C7W4.this;
                                C7U0 c7u0 = c7w42.A08;
                                if (c7u0 == null) {
                                    return null;
                                }
                                C160907Iy c160907Iy = C160907Iy.A00;
                                C7TT C7W = c7u0.C7r().C7W();
                                C14360o3.A07(C7W);
                                return c160907Iy.A00(c7w42.A0d, C7W);
                            }
                        }, new InterfaceC08830cm() { // from class: X.7K2
                            @Override // X.InterfaceC08830cm
                            public final /* bridge */ /* synthetic */ Object get() {
                                return Boolean.valueOf(C7W4.A0G(C7W4.this));
                            }
                        }, 23592968);
                        c7w4.A0C = c62882tR;
                        abstractC59962oe.registerLifecycleListener(c62882tR);
                        C7U0 c7u0 = c7w4.A08;
                        if (c7u0 != null) {
                            c7u0.Avk().D8Q();
                            LayoutInflater layoutInflater2 = abstractC59962oe.requireActivity().getLayoutInflater();
                            C14360o3.A07(layoutInflater2);
                            View A00 = C50802Vb.A00(layoutInflater2, null, viewGroup, R.layout.fragment_direct_message_thread, 0, false, true);
                            if (c7w4.A12 == "follow_button") {
                                A00.setVisibility(8);
                            }
                            C7ZM c7zm = c7w4.A0p;
                            C7U0 c7u02 = c7w4.A08;
                            if (c7u02 != null) {
                                c7zm.D8T(c7u02);
                                C164197Wi c164197Wi = c7w4.A0j;
                                C7XA c7xa = c164197Wi.A0H;
                                C14360o3.A0B(A00, 0);
                                c7xa.A04 = AbstractC56372iV.A01(A00.requireViewById(R.id.direct_thread_new_message_indicator_avatar_view), false, false);
                                if (!C18U.A06(C06090Tz.A05, c7xa.A08, 36318033005647713L)) {
                                    C7XA.A00(c7xa.A04, c7xa);
                                }
                                C7XI c7xi = c164197Wi.A0C;
                                c7xi.A00 = new C7KL(c7xi.A03, c7xi.A04, c7xi.A06, (C7U0) c7xi.A07.get());
                                C7U0 c7u03 = c7w4.A08;
                                if (c7u03 != null) {
                                    c62882tR.A02 = Boolean.valueOf(c7u03.C7r().CVY());
                                    ((C98O) c7w4.A0w).A03.A05();
                                    AbstractC09800fd.A00(-1908779022);
                                    C0f9.A09(351583067, A02);
                                    return A00;
                                }
                            }
                        }
                        C14360o3.A0F("clientInfra");
                        throw C00O.createAndThrow();
                    }
                    throw new IllegalStateException("Required value was null.");
                } catch (Throwable th) {
                    AbstractC09800fd.A00(-1236524574);
                    throw th;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ScheduledFuture scheduledFuture;
        int A02 = C0f9.A02(-576598005);
        super.onDestroy();
        C7W4 c7w4 = this.A00;
        if (c7w4 == null) {
            C14360o3.A0F("threadController");
            throw C00O.createAndThrow();
        }
        AbstractC09800fd.A01("DirectThreadController.onDestroy", -1584257124);
        try {
            C7U0 c7u0 = c7w4.A08;
            if (c7u0 != null) {
                InterfaceC163837Ux C7r = c7u0.C7r();
                if (C7r.CeQ()) {
                    C7r.C7U();
                    if (!C7r.C7U().isEmpty() && C7r.C7U().size() <= 1) {
                        String str = (String) C7r.C7U().get(0);
                        C23031Ai A00 = AbstractC23021Ah.A00(c7w4.A0d);
                        C14360o3.A0A(str);
                        C14360o3.A0B(str, 0);
                        InterfaceC19630xq interfaceC19630xq = A00.A01;
                        int i = interfaceC19630xq.getInt(AnonymousClass001.A0R("kindness_reminder_prefix/", str), 0);
                        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                        ARD.E7D(AnonymousClass001.A0R("kindness_reminder_prefix/", str), i + 1);
                        ARD.apply();
                    }
                }
                boolean z = true;
                boolean z2 = false;
                if (!"direct_message_search".equals(c7w4.A12)) {
                    z2 = true;
                }
                C164197Wi c164197Wi = c7w4.A0j;
                C7IM c7im = c164197Wi.A0M.A04;
                if (c7im != null && z2 && c7im.A0A) {
                    C162247Oj.A06.clear();
                }
                C7U0 c7u02 = c7w4.A08;
                if (c7u02 != null) {
                    c7u02.onDestroy();
                    C7U0 c7u03 = c7w4.A08;
                    if (c7u03 != null) {
                        c7u03.Avk().D9u(new C44150JfF(c7w4), c7u03.C7r().Afi());
                        C7U0 c7u04 = c7w4.A08;
                        if (c7u04 != null) {
                            c7u04.C78().D9t(C7W4.A02(c7w4));
                            C7U0 c7u05 = c7w4.A08;
                            if (c7u05 != null) {
                                InterfaceC163557Ts BT6 = c7u05.BT6();
                                BT6.Ec8(false);
                                BT6.EZD(false);
                                c7w4.A0S.removeCallbacksAndMessages(null);
                                c7w4.A0c.A01();
                                c7w4.A0b.A01();
                                c7w4.A0p.onDestroy();
                                C7X3 c7x3 = c164197Wi.A0P;
                                java.util.Set set = c7x3.A04;
                                Iterator it = set.iterator();
                                while (it.hasNext()) {
                                    c7x3.A01.markerEnd(c7x3.A00, ((String) it.next()).hashCode(), (short) 4);
                                }
                                set.clear();
                                c7x3.A03.clear();
                                C7U0 c7u06 = c7w4.A08;
                                if (c7u06 != null) {
                                    if (c7u06.C7r().C7W().A0n) {
                                        UserSession userSession = c7w4.A0d;
                                        C36294Fzo A002 = C36294Fzo.A00(userSession);
                                        boolean z3 = false;
                                        if (A002.A00 != null) {
                                            z3 = true;
                                        }
                                        C36303Fzy A003 = C36303Fzy.A00(userSession);
                                        if (!z3) {
                                            A003.A07(EnumC33509Eri.ABANDON);
                                        } else {
                                            C34721FRi c34721FRi = A003.A01;
                                            if (c34721FRi != null && (scheduledFuture = c34721FRi.A09) != null) {
                                                scheduledFuture.cancel(true);
                                            }
                                        }
                                        C31600DuS.A00(userSession, false).A03();
                                        A002.A02("thread_deeplinking");
                                    }
                                    c7w4.A0e.onDestroy();
                                    UserSession userSession2 = c7w4.A0d;
                                    userSession2.A03(C7ZX.class);
                                    ExecutorService executorService = MWU.A00;
                                    if (executorService != null) {
                                        executorService.shutdownNow();
                                    }
                                    MWU.A00 = null;
                                    AbstractC165897bH.A00(userSession2).A07();
                                    if (C18U.A06(C06090Tz.A06, userSession2, 36325214186910597L)) {
                                        AbstractC46706KlP.A00(c7w4.A0V, userSession2).A00.clear();
                                    }
                                    C7VQ c7vq = c7w4.A0k.A09;
                                    C0eR c0eR = c7w4.A0U.mLifecycleRegistry;
                                    C14360o3.A07(c0eR);
                                    Iterator it2 = c7vq.A00.iterator();
                                    while (it2.hasNext()) {
                                        ((C7VI) it2.next()).A06(c0eR);
                                    }
                                    C7XK c7xk = c164197Wi.A0G;
                                    InterfaceC163837Ux C7r2 = ((C7U0) c7xk.A06.invoke()).C7r();
                                    if (C7r2.CXo()) {
                                        C5G2 c5g2 = (C5G2) c7xk.A05.getValue();
                                        String C7I = C7r2.C7I();
                                        if (C7I != null) {
                                            c5g2.A02.remove(C7I);
                                        }
                                    }
                                    C7U0 c7u07 = c7w4.A08;
                                    if (c7u07 != null) {
                                        InterfaceC83713oG C7i = c7u07.C7r().C7i();
                                        C14360o3.A07(C7i);
                                        if (AbstractC140946Yw.A07(C7i)) {
                                            z = false;
                                        }
                                        C47706L4n A004 = AbstractC162257On.A00(userSession2, z);
                                        if (A004 != null) {
                                            A004.A00 = null;
                                            AbstractC23641Du.A05(AnonymousClass191.A00, new D4v(A004, null, 24), AnonymousClass194.A02(C12L.A00.AOT(837858400, 3)));
                                        }
                                        c7w4.A0T.A01 = null;
                                        C7FC.A00(userSession2).AHe();
                                        C6QM.A00(c7w4);
                                        AbstractC09800fd.A00(-1886563064);
                                        C0f9.A09(255481381, A02);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            C14360o3.A0F("clientInfra");
            throw C00O.createAndThrow();
        } catch (Throwable th) {
            AbstractC09800fd.A00(1127734494);
            throw th;
        }
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        String str;
        RecyclerView recyclerView;
        int A02 = C0f9.A02(-1547185080);
        super.onDestroyView();
        C7W4 c7w4 = this.A00;
        if (c7w4 == null) {
            C14360o3.A0F("threadController");
            throw C00O.createAndThrow();
        }
        AbstractC09800fd.A01("DirectThreadController.onDestroyView", -1387147144);
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("direct_thread_fragment_request_code", c7w4.A01);
            AbstractC59962oe abstractC59962oe = c7w4.A0U;
            abstractC59962oe.requireActivity().getSupportFragmentManager().A0y("direct_thread_exit_request_key", bundle);
            c7w4.A0p.onDestroyView();
            C7U0 c7u0 = c7w4.A08;
            String str2 = null;
            if (c7u0 == null) {
                str = "clientInfra";
            } else {
                c7u0.Avk().onDestroyView();
                C164197Wi c164197Wi = c7w4.A0j;
                C7IR c7ir = c164197Wi.A02;
                if (c7ir != null) {
                    c7ir.A00.A01();
                    c7w4.A0e.EFx(c7w4.A0g);
                    ViewGroup viewGroup = c7w4.A03;
                    if (viewGroup != null) {
                        C55942hf c55942hf = C150956qv.A02;
                        AbstractC125325le.A01(viewGroup, 0).A0G();
                        RecyclerView recyclerView2 = c7w4.A04;
                        str = "messageRecyclerView";
                        if (recyclerView2 != null) {
                            recyclerView2.setAdapter(null);
                            UserSession userSession = c7w4.A0d;
                            C25671My A00 = AbstractC25651Mw.A00(userSession);
                            A00.A02(c7w4.A0Z, C7LZ.class);
                            A00.A02(c7w4.A0a, C7I1.class);
                            if (c7w4.A0J) {
                                AbstractC25651Mw.A00(userSession).A02(c7w4.A0X, C29151CtI.class);
                            }
                            C7XA c7xa = c164197Wi.A0H;
                            C55982hj c55982hj = c7xa.A02;
                            if (c55982hj != null) {
                                c55982hj.A00();
                            }
                            c7xa.A02 = null;
                            c7xa.A01 = null;
                            c7xa.A03 = null;
                            c7xa.A05 = null;
                            C62882tR c62882tR = c7w4.A0C;
                            if (c62882tR != null) {
                                RecyclerView recyclerView3 = c7w4.A04;
                                if (recyclerView3 != null) {
                                    recyclerView3.A15(c62882tR);
                                }
                            }
                            abstractC59962oe.unregisterLifecycleListener(c7w4.A0C);
                            c7w4.A0C = null;
                            C7XI c7xi = c164197Wi.A0C;
                            C7KL c7kl = c7xi.A00;
                            if (c7kl != null) {
                                c7kl.A0N.removeCallbacksAndMessages(null);
                                c7kl.A0I = null;
                                c7kl.A0F = null;
                                c7kl.A0E = null;
                                c7kl.A0B = null;
                                c7kl.A08 = null;
                                c7kl.A0D = null;
                                c7kl.A0C = null;
                                c7kl.A0K = null;
                                c7kl.A02 = null;
                                c7kl.A0J = null;
                            }
                            c7xi.A00 = null;
                            C7O4 c7o4 = c7w4.A07;
                            if (c7o4 != null) {
                                c7o4.A00();
                                c7o4.A0D.clear();
                                c7o4.A03 = null;
                                C1I4 c1i4 = c7o4.A00;
                                if (c1i4 != null && (recyclerView = c7o4.A01) != null) {
                                    recyclerView.A15(c1i4);
                                }
                                c7o4.A01 = null;
                            }
                            if (C4AC.A0E(userSession)) {
                                InterfaceC19610xo ARD = AbstractC23021Ah.A00(userSession).A01.ARD();
                                ARD.E77(AbstractC43591JPw.A00(1021), false);
                                ARD.apply();
                            }
                            C14360o3.A0B(userSession, 0);
                            C06090Tz c06090Tz = C06090Tz.A05;
                            if (C18U.A06(c06090Tz, userSession, 36327645138533113L)) {
                                AbstractC135966Db.A01(userSession).A0B.clear();
                            }
                            C7X7 c7x7 = c164197Wi.A0N;
                            C7LU c7lu = c7x7.A01;
                            if (c7lu != null) {
                                c7lu.A01();
                            }
                            c7x7.A01 = null;
                            c7x7.A04.removeCallbacksAndMessages(null);
                            if (C18U.A06(c06090Tz, c7x7.A05, 36324612891816209L)) {
                                c7x7.A07.A08();
                                if (c7x7.A00 != null) {
                                    Choreographer.getInstance().removeFrameCallback(c7x7.A00);
                                    c7x7.A00 = null;
                                }
                            }
                            C120115cA A002 = AbstractC120095c8.A00(userSession);
                            Map map = A002.A02;
                            Iterator it = map.entrySet().iterator();
                            while (it.hasNext()) {
                                A002.A01.markerEnd(814299525, ((L42) ((Map.Entry) it.next()).getValue()).A02, (short) 4);
                            }
                            map.clear();
                            A002.A04.clear();
                            C7F4.A00(userSession).A05(C05F.A0C);
                            C164247Wn c164247Wn = c164197Wi.A0M;
                            C3Se c3Se = c164247Wn.A02;
                            C3PR c3pr = c164247Wn.A03;
                            if (c3pr != null && c3Se != null) {
                                c3pr.A02(c3Se);
                                c164247Wn.A03 = null;
                            }
                            C7N0.A00(userSession).onExitThreadView();
                            c164197Wi.A0G.A00 = null;
                            C06090Tz c06090Tz2 = C06090Tz.A06;
                            if (C18U.A06(c06090Tz2, userSession, 36311560486191708L) && C18U.A06(c06090Tz2, userSession, 36311560487371374L)) {
                                Activity rootActivity = abstractC59962oe.getRootActivity();
                                if (rootActivity != null) {
                                    C57992lC.A02(rootActivity, c7w4.A10);
                                } else {
                                    throw new IllegalStateException("Required value was null.");
                                }
                            }
                            IGFOAMessagingThreadViewNavigationLogger logger = IGFOAMessagingThreadViewNavigationLoggingController.INSTANCE.getLogger(userSession);
                            if (logger != null) {
                                DirectThreadKey A0M = c7w4.A0M();
                                if (A0M != null) {
                                    str2 = A0M.A00;
                                }
                                logger.maybeEndFlowCancel(str2, "DirectThreadController.onDestroyView");
                            }
                            AbstractC09800fd.A00(1858677084);
                            C0f9.A09(727651896, A02);
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    str = "sendController";
                }
            }
            C14360o3.A0F(str);
        } catch (Throwable th) {
            AbstractC09800fd.A00(1249542897);
            throw th;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        boolean z;
        DirectMessageIdentifier directMessageIdentifier;
        int A02 = C0f9.A02(-150126442);
        super.onPause();
        C7W4 c7w4 = this.A00;
        if (c7w4 == null) {
            C14360o3.A0F("threadController");
            throw C00O.createAndThrow();
        }
        AbstractC09800fd.A01("DirectThreadController.onPause", -523755699);
        try {
            C7U0 c7u0 = c7w4.A08;
            String str = "clientInfra";
            if (c7u0 != null) {
                c7u0.Avk().onPause();
                c7w4.A0p.onPause();
                C2055097z c2055097z = c7w4.A0x;
                C226418s c226418s = c2055097z.A08;
                C1KX c1kx = c226418s.A05;
                if (c1kx != null) {
                    z = c1kx.A0H;
                } else {
                    z = false;
                }
                if (!z) {
                    c2055097z.A01(C2055097z.A0B);
                    C1KX c1kx2 = c226418s.A05;
                    if (c1kx2 != null) {
                        c1kx2.A0H = false;
                    }
                }
                UserSession userSession = c7w4.A0d;
                C14360o3.A0B(userSession, 0);
                IGFOAMessagingThreadViewNavigationLogger logger = IGFOAMessagingThreadViewNavigationLoggingController.INSTANCE.getLogger(userSession);
                if (logger != null) {
                    logger.onLogDirectThreadFragmentPaused();
                }
                RecyclerView recyclerView = c7w4.A04;
                if (recyclerView != null) {
                    recyclerView.A15(c7w4.A0z);
                    C164197Wi c164197Wi = c7w4.A0j;
                    C7XB c7xb = c164197Wi.A0K;
                    RecyclerView recyclerView2 = c7w4.A04;
                    if (recyclerView2 != null) {
                        AbstractC70663Fe abstractC70663Fe = recyclerView2.A0D;
                        if (abstractC70663Fe != null && (abstractC70663Fe instanceof DirectMessageListLinearLayoutManager)) {
                            C7XC c7xc = c7xb.A02;
                            C14360o3.A0B(c7xc, 0);
                            ((DirectMessageListLinearLayoutManager) abstractC70663Fe).A00.A03.add(c7xc);
                        }
                        C7XI c7xi = c164197Wi.A0C;
                        C7KL c7kl = c7xi.A00;
                        if (c7kl != null) {
                            c7kl.A0N.removeCallbacksAndMessages(null);
                        }
                        if (((Boolean) c7xi.A0B.getValue()).booleanValue()) {
                            AbstractC25651Mw.A00(c7xi.A06).A02(c7xi.A05, C7OG.class);
                        }
                        C2DL.A00(userSession).A00.remove(c7w4);
                        if (c164197Wi.A01 != null) {
                            AbstractC25651Mw.A00(userSession).A02(c7w4.A0Y, C55988OtL.class);
                        }
                        AbstractC75493aG.A00(userSession).A00(c7w4);
                        if (c7w4.A0v.A00()) {
                            C7U0 c7u02 = c7w4.A08;
                            if (c7u02 != null) {
                                ((C48712Lgg) c7u02).A01.A01();
                            }
                        }
                        C7DK c7dk = c164197Wi.A06;
                        if (c7dk != null) {
                            C47664L2x c47664L2x = c7dk.A02;
                            if (c47664L2x != null && (directMessageIdentifier = c47664L2x.A01) != null && c7dk.A0C() && C18U.A06(C06090Tz.A05, userSession, 36319188347788320L)) {
                                C7U0 c7u03 = c7w4.A08;
                                if (c7u03 != null) {
                                    if (c7u03.BT6().CNL(directMessageIdentifier.A02) != -1) {
                                        Context requireContext = c7w4.A0U.requireContext();
                                        C7U0 c7u04 = c7w4.A08;
                                        if (c7u04 != null) {
                                            String C7l = c7u04.C7r().C7l();
                                            C7U0 c7u05 = c7w4.A08;
                                            if (c7u05 != null) {
                                                String A08 = C4GQ.A08(requireContext, userSession, C7l, c7u05.C7r().BSH(), false);
                                                C14360o3.A07(A08);
                                                C123735in A00 = AbstractC123725im.A00(userSession);
                                                A00.A02 = A08;
                                                A00.A00 = c7dk;
                                                C123735in.A01(A00);
                                            }
                                        }
                                    }
                                }
                            } else {
                                c7dk.A09("fragment_paused");
                            }
                            AbstractC09800fd.A00(538485235);
                            C0f9.A09(-823789378, A02);
                            return;
                        }
                        str = "audioPlayer";
                    }
                }
                C14360o3.A0F("messageRecyclerView");
                throw C00O.createAndThrow();
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        } catch (Throwable th) {
            AbstractC09800fd.A00(858524568);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x03e2 A[Catch: all -> 0x04a8, TryCatch #0 {all -> 0x04a8, blocks: (B:12:0x002f, B:14:0x0033, B:15:0x0036, B:17:0x004b, B:19:0x0055, B:21:0x0067, B:23:0x006b, B:24:0x0089, B:26:0x008e, B:28:0x009b, B:29:0x0094, B:32:0x00ab, B:34:0x00af, B:36:0x00da, B:37:0x00f0, B:38:0x043b, B:189:0x049a, B:41:0x0136, B:43:0x013a, B:45:0x0157, B:46:0x0172, B:48:0x0176, B:50:0x0181, B:52:0x0194, B:53:0x0197, B:55:0x019d, B:57:0x01a7, B:59:0x01ab, B:61:0x01af, B:62:0x01b2, B:64:0x01b6, B:65:0x01c1, B:67:0x01c5, B:69:0x01d1, B:71:0x01d5, B:73:0x01e1, B:75:0x01e9, B:77:0x01f8, B:78:0x0202, B:80:0x020a, B:81:0x0214, B:84:0x0239, B:86:0x0249, B:87:0x0267, B:88:0x0270, B:91:0x0276, B:93:0x027f, B:95:0x028d, B:97:0x0291, B:99:0x0295, B:100:0x02a3, B:102:0x02b8, B:103:0x02c5, B:109:0x0320, B:110:0x032b, B:112:0x032f, B:114:0x0339, B:116:0x033d, B:118:0x0347, B:120:0x034b, B:122:0x0354, B:124:0x0358, B:125:0x035f, B:127:0x0363, B:129:0x036d, B:130:0x0370, B:132:0x037f, B:134:0x038c, B:135:0x0396, B:137:0x03b0, B:139:0x03b6, B:141:0x03bc, B:143:0x03c2, B:145:0x03d2, B:146:0x03d9, B:147:0x03dc, B:149:0x03e2, B:151:0x03eb, B:153:0x03ef, B:156:0x040c, B:160:0x042a, B:162:0x0435, B:165:0x043f, B:166:0x0442, B:168:0x0450, B:170:0x0456, B:172:0x0476, B:173:0x0486, B:177:0x03f5, B:178:0x0403, B:179:0x02f2, B:181:0x030a, B:184:0x031c, B:185:0x0416, B:187:0x041e, B:188:0x0493, B:191:0x022c, B:193:0x0230, B:194:0x0422), top: B:11:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0435 A[Catch: all -> 0x04a8, TryCatch #0 {all -> 0x04a8, blocks: (B:12:0x002f, B:14:0x0033, B:15:0x0036, B:17:0x004b, B:19:0x0055, B:21:0x0067, B:23:0x006b, B:24:0x0089, B:26:0x008e, B:28:0x009b, B:29:0x0094, B:32:0x00ab, B:34:0x00af, B:36:0x00da, B:37:0x00f0, B:38:0x043b, B:189:0x049a, B:41:0x0136, B:43:0x013a, B:45:0x0157, B:46:0x0172, B:48:0x0176, B:50:0x0181, B:52:0x0194, B:53:0x0197, B:55:0x019d, B:57:0x01a7, B:59:0x01ab, B:61:0x01af, B:62:0x01b2, B:64:0x01b6, B:65:0x01c1, B:67:0x01c5, B:69:0x01d1, B:71:0x01d5, B:73:0x01e1, B:75:0x01e9, B:77:0x01f8, B:78:0x0202, B:80:0x020a, B:81:0x0214, B:84:0x0239, B:86:0x0249, B:87:0x0267, B:88:0x0270, B:91:0x0276, B:93:0x027f, B:95:0x028d, B:97:0x0291, B:99:0x0295, B:100:0x02a3, B:102:0x02b8, B:103:0x02c5, B:109:0x0320, B:110:0x032b, B:112:0x032f, B:114:0x0339, B:116:0x033d, B:118:0x0347, B:120:0x034b, B:122:0x0354, B:124:0x0358, B:125:0x035f, B:127:0x0363, B:129:0x036d, B:130:0x0370, B:132:0x037f, B:134:0x038c, B:135:0x0396, B:137:0x03b0, B:139:0x03b6, B:141:0x03bc, B:143:0x03c2, B:145:0x03d2, B:146:0x03d9, B:147:0x03dc, B:149:0x03e2, B:151:0x03eb, B:153:0x03ef, B:156:0x040c, B:160:0x042a, B:162:0x0435, B:165:0x043f, B:166:0x0442, B:168:0x0450, B:170:0x0456, B:172:0x0476, B:173:0x0486, B:177:0x03f5, B:178:0x0403, B:179:0x02f2, B:181:0x030a, B:184:0x031c, B:185:0x0416, B:187:0x041e, B:188:0x0493, B:191:0x022c, B:193:0x0230, B:194:0x0422), top: B:11:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0450 A[Catch: all -> 0x04a8, TryCatch #0 {all -> 0x04a8, blocks: (B:12:0x002f, B:14:0x0033, B:15:0x0036, B:17:0x004b, B:19:0x0055, B:21:0x0067, B:23:0x006b, B:24:0x0089, B:26:0x008e, B:28:0x009b, B:29:0x0094, B:32:0x00ab, B:34:0x00af, B:36:0x00da, B:37:0x00f0, B:38:0x043b, B:189:0x049a, B:41:0x0136, B:43:0x013a, B:45:0x0157, B:46:0x0172, B:48:0x0176, B:50:0x0181, B:52:0x0194, B:53:0x0197, B:55:0x019d, B:57:0x01a7, B:59:0x01ab, B:61:0x01af, B:62:0x01b2, B:64:0x01b6, B:65:0x01c1, B:67:0x01c5, B:69:0x01d1, B:71:0x01d5, B:73:0x01e1, B:75:0x01e9, B:77:0x01f8, B:78:0x0202, B:80:0x020a, B:81:0x0214, B:84:0x0239, B:86:0x0249, B:87:0x0267, B:88:0x0270, B:91:0x0276, B:93:0x027f, B:95:0x028d, B:97:0x0291, B:99:0x0295, B:100:0x02a3, B:102:0x02b8, B:103:0x02c5, B:109:0x0320, B:110:0x032b, B:112:0x032f, B:114:0x0339, B:116:0x033d, B:118:0x0347, B:120:0x034b, B:122:0x0354, B:124:0x0358, B:125:0x035f, B:127:0x0363, B:129:0x036d, B:130:0x0370, B:132:0x037f, B:134:0x038c, B:135:0x0396, B:137:0x03b0, B:139:0x03b6, B:141:0x03bc, B:143:0x03c2, B:145:0x03d2, B:146:0x03d9, B:147:0x03dc, B:149:0x03e2, B:151:0x03eb, B:153:0x03ef, B:156:0x040c, B:160:0x042a, B:162:0x0435, B:165:0x043f, B:166:0x0442, B:168:0x0450, B:170:0x0456, B:172:0x0476, B:173:0x0486, B:177:0x03f5, B:178:0x0403, B:179:0x02f2, B:181:0x030a, B:184:0x031c, B:185:0x0416, B:187:0x041e, B:188:0x0493, B:191:0x022c, B:193:0x0230, B:194:0x0422), top: B:11:0x002f }] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() {
        /*
            Method dump skipped, instructions count: 1200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51B.onResume():void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        DirectThreadThemeInfo directThreadThemeInfo;
        int A02 = C0f9.A02(-1794203931);
        super.onStop();
        C7W4 c7w4 = this.A00;
        if (c7w4 == null) {
            C14360o3.A0F("threadController");
            throw C00O.createAndThrow();
        }
        AbstractC09800fd.A01("DirectThreadController.onStop", 263856781);
        try {
            FragmentActivity requireActivity = c7w4.A0U.requireActivity();
            C164247Wn c164247Wn = c7w4.A0j.A0M;
            if (c7w4.A08 != null) {
                C7IM c7im = c164247Wn.A04;
                boolean z = false;
                if (c7im == null || (directThreadThemeInfo = c7im.A08) == null || !directThreadThemeInfo.A0t) {
                    z = true;
                }
                C30D.A06(requireActivity, z);
                C7U0 c7u0 = c7w4.A08;
                if (c7u0 != null) {
                    if (c7u0.C7r().C7W().A0o) {
                        C7U0 c7u02 = c7w4.A08;
                        if (c7u02 != null) {
                            if (!c7u02.C7r().C7W().A13) {
                                C7W9 c7w9 = c7w4.A0T;
                                C7W9.A00(c7w9, new C50157MDk(c7w9, 16));
                            }
                        }
                    }
                    c7w4.A0p.onStop();
                    AbstractC09800fd.A00(1912493913);
                    C0f9.A09(1986258474, A02);
                    return;
                }
            }
            C14360o3.A0F("clientInfra");
            throw C00O.createAndThrow();
        } catch (Throwable th) {
            AbstractC09800fd.A00(104493528);
            throw th;
        }
    }
}
