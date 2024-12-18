package X;

import com.facebook.advancedcryptotransport.mca.MailboxAdvancedCryptoTransportJNI;
import com.facebook.businessinbox.mca.MailboxBusinessInboxJNI;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.cutoverinternal.mca.MailboxCutoverInternalJNI;
import com.facebook.forker.Process;
import com.facebook.fts.mca.MailboxFTSJNI;
import com.facebook.globaldeletesettings.mca.MailboxGlobalDeleteSettingsJNI;
import com.facebook.instagramopenxmareceiverfetch.mca.MailboxInstagramOpenXmaReceiverFetchJNI;
import com.facebook.instagrampresence.mca.MailboxInstagramPresenceJNI;
import com.facebook.instagramsearch.mca.MailboxInstagramSearchJNI;
import com.facebook.instagramsecuremessage.mca.MailboxInstagramSecureMessageJNI;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.mci.CQLResultSet;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;
import com.facebook.notificationengineinstagramintegrator.mca.MailboxNotificationEngineInstagramIntegratorJNI;
import com.facebook.proactivewarnings.mca.MailboxProactiveWarningsJNI;
import com.facebook.proactivewarningsnoncore.mca.MailboxProactiveWarningsNonCoreJNI;
import com.facebook.safetyinterventions.mca.MailboxSafetyInterventionsJNI;
import com.facebook.secureconsentframework.mca.MailboxSecureConsentFrameworkJNI;
import com.facebook.shim.mca.MailboxShimJNI;
import com.facebook.tam.mca.MailboxTamJNI;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* loaded from: classes8.dex */
public final class JRF implements MailboxFeature.DbConnectionResolutionCallback {
    public final int A00;
    public final Object A01;

    public JRF(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static JRF A00(Object obj, int i) {
        return new JRF(obj, i);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    @Override // com.facebook.msys.mca.MailboxFeature.DbConnectionResolutionCallback
    public final /* bridge */ /* synthetic */ Object run(Mailbox mailbox, SqliteHolder sqliteHolder) {
        Object abstractC1351869s;
        switch (this.A00) {
            case 0:
                LUP lup = (LUP) this.A01;
                return MailboxAdvancedCryptoTransportJNI.dispatchCqlOIIJOO(19, 3, 9999, lup.A01, lup.A03, sqliteHolder);
            case 1:
                return MailboxAdvancedCryptoTransportJNI.dispatchCqlOIJO(20, 3, ((LVG) this.A01).A01, sqliteHolder);
            case 2:
                CQLResultSet cQLResultSet = (CQLResultSet) MailboxAdvancedCryptoTransportJNI.dispatchCqlOIJO(21, 3, ((LVG) this.A01).A01, sqliteHolder);
                if (cQLResultSet != null) {
                    abstractC1351869s = new AbstractC1351869s(cQLResultSet);
                    return new MailboxNullable(abstractC1351869s);
                }
                abstractC1351869s = null;
                return new MailboxNullable(abstractC1351869s);
            case 3:
                LUW luw = (LUW) this.A01;
                return MailboxAdvancedCryptoTransportJNI.dispatchCqlOIIJOOZ(22, 3, luw.A00, luw.A01, luw.A05, sqliteHolder, luw.A04);
            case 4:
                return MailboxAdvancedCryptoTransportJNI.dispatchCqlOIJO(23, 3, ((LVG) this.A01).A01, sqliteHolder);
            case 5:
                return MailboxAdvancedCryptoTransportJNI.dispatchCqlOIJOO(24, 3, ((LVG) this.A01).A01, null, sqliteHolder);
            case 6:
                return MailboxAdvancedCryptoTransportJNI.dispatchCqlOO(4, sqliteHolder);
            case 7:
                return MailboxAdvancedCryptoTransportJNI.dispatchCqlOO(5, sqliteHolder);
            case 8:
                return MailboxAdvancedCryptoTransportJNI.dispatchCqlOO(6, sqliteHolder);
            case 9:
                CQLResultSet cQLResultSet2 = (CQLResultSet) MailboxBusinessInboxJNI.dispatchCqlOO(4, sqliteHolder);
                if (cQLResultSet2 != null) {
                    abstractC1351869s = new AbstractC1351869s(cQLResultSet2);
                    return new MailboxNullable(abstractC1351869s);
                }
                abstractC1351869s = null;
                return new MailboxNullable(abstractC1351869s);
            case 10:
                return MailboxCutoverInternalJNI.dispatchCqlOJO(0, ((LVG) this.A01).A01, sqliteHolder);
            case 11:
                LUI lui = (LUI) this.A01;
                CQLResultSet cQLResultSet3 = (CQLResultSet) MailboxFTSJNI.dispatchCqlOIJOOOOZ(2, 10, lui.A00, "AdvancedCrypto", lui.A04, lui.A03, sqliteHolder, false);
                if (cQLResultSet3 != null) {
                    abstractC1351869s = new AbstractC1351869s(cQLResultSet3);
                    return new MailboxNullable(abstractC1351869s);
                }
                abstractC1351869s = null;
                return new MailboxNullable(abstractC1351869s);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                LVI lvi = (LVI) this.A01;
                CQLResultSet cQLResultSet4 = (CQLResultSet) MailboxFTSJNI.dispatchCqlOIJOOO(3, lvi.A01, lvi.A02, "AdvancedCrypto", lvi.A05, sqliteHolder);
                if (cQLResultSet4 != null) {
                    abstractC1351869s = new AbstractC1351869s(cQLResultSet4);
                    return new MailboxNullable(abstractC1351869s);
                }
                abstractC1351869s = null;
                return new MailboxNullable(abstractC1351869s);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return MailboxGlobalDeleteSettingsJNI.dispatchCqlOO(0, sqliteHolder);
            case 14:
                CQLResultSet cQLResultSet5 = (CQLResultSet) MailboxInstagramOpenXmaReceiverFetchJNI.dispatchCqlOOO(0, ((JVY) this.A01).A03, sqliteHolder);
                if (cQLResultSet5 != null) {
                    abstractC1351869s = new AbstractC1351869s(cQLResultSet5);
                    return new MailboxNullable(abstractC1351869s);
                }
                abstractC1351869s = null;
                return new MailboxNullable(abstractC1351869s);
            case Process.SIGTERM /* 15 */:
                C48194LUs c48194LUs = (C48194LUs) this.A01;
                return MailboxInstagramOpenXmaReceiverFetchJNI.dispatchDasmOOOOOOOZZ(0, c48194LUs.A05, c48194LUs.A04, c48194LUs.A03, c48194LUs.A06, mailbox, sqliteHolder, true, c48194LUs.A07);
            case 16:
                CQLResultSet cQLResultSet6 = (CQLResultSet) MailboxInstagramPresenceJNI.dispatchCqlOO(1, sqliteHolder);
                if (cQLResultSet6 != null) {
                    abstractC1351869s = new AbstractC1351869s(cQLResultSet6);
                    return new MailboxNullable(abstractC1351869s);
                }
                abstractC1351869s = null;
                return new MailboxNullable(abstractC1351869s);
            case 17:
                return MailboxInstagramPresenceJNI.dispatchDasmOOOO(0, ((LUR) this.A01).A02, mailbox, sqliteHolder);
            case 18:
                LUK luk = (LUK) this.A01;
                return MailboxInstagramPresenceJNI.dispatchDasmOIOOO(1, luk.A00, luk.A04, mailbox, sqliteHolder);
            case Process.SIGSTOP /* 19 */:
                LUL lul = (LUL) this.A01;
                return MailboxInstagramPresenceJNI.dispatchDasmOOOOZ(3, lul.A03, mailbox, sqliteHolder, lul.A04);
            case 20:
                CQLResultSet cQLResultSet7 = (CQLResultSet) MailboxInstagramSearchJNI.dispatchCqlOOO(0, ((LUF) this.A01).A03, sqliteHolder);
                if (cQLResultSet7 != null) {
                    abstractC1351869s = new AbstractC1351869s(cQLResultSet7);
                    return new MailboxNullable(abstractC1351869s);
                }
                abstractC1351869s = null;
                return new MailboxNullable(abstractC1351869s);
            case 21:
                CQLResultSet cQLResultSet8 = (CQLResultSet) MailboxInstagramSecureMessageJNI.dispatchCqlOO(8, sqliteHolder);
                if (cQLResultSet8 != null) {
                    abstractC1351869s = new AbstractC1351869s(cQLResultSet8);
                    return new MailboxNullable(abstractC1351869s);
                }
                abstractC1351869s = null;
                return new MailboxNullable(abstractC1351869s);
            case 22:
                CQLResultSet cQLResultSet9 = (CQLResultSet) MailboxInstagramSecureMessageJNI.dispatchCqlOJO(12, ((LVJ) this.A01).A02, sqliteHolder);
                if (cQLResultSet9 != null) {
                    abstractC1351869s = new AbstractC1351869s(cQLResultSet9);
                    return new MailboxNullable(abstractC1351869s);
                }
                abstractC1351869s = null;
                return new MailboxNullable(abstractC1351869s);
            case 23:
                CQLResultSet cQLResultSet10 = (CQLResultSet) MailboxInstagramSecureMessageJNI.dispatchCqlOJO(16, ((LVJ) this.A01).A02, sqliteHolder);
                if (cQLResultSet10 != null) {
                    abstractC1351869s = new AbstractC1351869s(cQLResultSet10);
                    return new MailboxNullable(abstractC1351869s);
                }
                abstractC1351869s = null;
                return new MailboxNullable(abstractC1351869s);
            case 24:
                C48196LUu c48196LUu = (C48196LUu) this.A01;
                return MailboxInstagramSecureMessageJNI.dispatchCqlOIJOOOOO(22, c48196LUu.A01, c48196LUu.A02, c48196LUu.A07, null, c48196LUu.A06, c48196LUu.A05, sqliteHolder);
            case 25:
                CQLResultSet cQLResultSet11 = (CQLResultSet) MailboxInstagramSecureMessageJNI.dispatchCqlOJO(1, ((LVJ) this.A01).A02, sqliteHolder);
                if (cQLResultSet11 != null) {
                    abstractC1351869s = new AbstractC1351869s(cQLResultSet11);
                    return new MailboxNullable(abstractC1351869s);
                }
                abstractC1351869s = null;
                return new MailboxNullable(abstractC1351869s);
            case 26:
                CQLResultSet cQLResultSet12 = (CQLResultSet) MailboxInstagramSecureMessageJNI.dispatchCqlOO(2, sqliteHolder);
                if (cQLResultSet12 != null) {
                    abstractC1351869s = new AbstractC1351869s(cQLResultSet12);
                    return new MailboxNullable(abstractC1351869s);
                }
                abstractC1351869s = null;
                return new MailboxNullable(abstractC1351869s);
            case 27:
                LUZ luz = (LUZ) this.A01;
                return MailboxInstagramSecureMessageJNI.dispatchCqlOJJOOOO(40, luz.A02, luz.A01, null, luz.A05, null, sqliteHolder);
            case 28:
                CQLResultSet cQLResultSet13 = (CQLResultSet) MailboxInstagramSecureMessageJNI.dispatchCqlOJOZ(44, ((LVJ) this.A01).A02, sqliteHolder, false);
                if (cQLResultSet13 != null) {
                    abstractC1351869s = new AbstractC1351869s(cQLResultSet13);
                    return new MailboxNullable(abstractC1351869s);
                }
                abstractC1351869s = null;
                return new MailboxNullable(abstractC1351869s);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                C48176LUa c48176LUa = (C48176LUa) this.A01;
                return MailboxInstagramSecureMessageJNI.dispatchCqlOIJJO(46, c48176LUa.A00, c48176LUa.A03, c48176LUa.A02, sqliteHolder);
            case 30:
                LUM lum = (LUM) this.A01;
                return MailboxInstagramSecureMessageJNI.dispatchCqlOJOZ(48, lum.A01, sqliteHolder, lum.A04);
            case 31:
                abstractC1351869s = MailboxInstagramSecureMessageJNI.dispatchCqlOO(51, sqliteHolder);
                return new MailboxNullable(abstractC1351869s);
            case 32:
                abstractC1351869s = MailboxInstagramSecureMessageJNI.dispatchCqlOO(52, sqliteHolder);
                return new MailboxNullable(abstractC1351869s);
            case 33:
                CQLResultSet cQLResultSet14 = (CQLResultSet) MailboxInstagramSecureMessageJNI.dispatchCqlOOO(4, ((LUS) this.A01).A04, sqliteHolder);
                if (cQLResultSet14 != null) {
                    abstractC1351869s = new AbstractC1351869s(cQLResultSet14);
                    return new MailboxNullable(abstractC1351869s);
                }
                abstractC1351869s = null;
                return new MailboxNullable(abstractC1351869s);
            case 34:
                CQLResultSet cQLResultSet15 = (CQLResultSet) MailboxInstagramSecureMessageJNI.dispatchCqlOJO(64, ((LVJ) this.A01).A02, sqliteHolder);
                if (cQLResultSet15 != null) {
                    abstractC1351869s = new AbstractC1351869s(cQLResultSet15);
                    return new MailboxNullable(abstractC1351869s);
                }
                abstractC1351869s = null;
                return new MailboxNullable(abstractC1351869s);
            case 35:
                CQLResultSet cQLResultSet16 = (CQLResultSet) MailboxInstagramSecureMessageJNI.dispatchCqlOOZ(72, sqliteHolder, ((JWY) this.A01).A04);
                if (cQLResultSet16 != null) {
                    abstractC1351869s = new AbstractC1351869s(cQLResultSet16);
                    return new MailboxNullable(abstractC1351869s);
                }
                abstractC1351869s = null;
                return new MailboxNullable(abstractC1351869s);
            case 36:
                CQLResultSet cQLResultSet17 = (CQLResultSet) MailboxInstagramSecureMessageJNI.dispatchCqlOOO(74, ((LUQ) this.A01).A04, sqliteHolder);
                if (cQLResultSet17 != null) {
                    abstractC1351869s = new AbstractC1351869s(cQLResultSet17);
                    return new MailboxNullable(abstractC1351869s);
                }
                abstractC1351869s = null;
                return new MailboxNullable(abstractC1351869s);
            case 37:
                CQLResultSet cQLResultSet18 = (CQLResultSet) MailboxInstagramSecureMessageJNI.dispatchCqlOJO(75, ((LVJ) this.A01).A02, sqliteHolder);
                if (cQLResultSet18 != null) {
                    abstractC1351869s = new AbstractC1351869s(cQLResultSet18);
                    return new MailboxNullable(abstractC1351869s);
                }
                abstractC1351869s = null;
                return new MailboxNullable(abstractC1351869s);
            case 38:
                LUS lus = (LUS) this.A01;
                abstractC1351869s = MailboxNotificationEngineInstagramIntegratorJNI.dispatchCqlOIOO(6, lus.A01, lus.A04, sqliteHolder);
                return new MailboxNullable(abstractC1351869s);
            case 39:
                return MailboxProactiveWarningsJNI.dispatchDasmOJOOOO(0, ((LUP) this.A01).A01, null, null, mailbox, sqliteHolder);
            case 40:
                CQLResultSet cQLResultSet19 = (CQLResultSet) MailboxProactiveWarningsNonCoreJNI.dispatchCqlOJO(1, ((LVG) this.A01).A01, sqliteHolder);
                if (cQLResultSet19 != null) {
                    abstractC1351869s = new AbstractC1351869s(cQLResultSet19);
                    return new MailboxNullable(abstractC1351869s);
                }
                abstractC1351869s = null;
                return new MailboxNullable(abstractC1351869s);
            case Seq.NULL_REFNUM /* 41 */:
                CQLResultSet cQLResultSet20 = (CQLResultSet) MailboxSafetyInterventionsJNI.dispatchCqlOO(0, sqliteHolder);
                if (cQLResultSet20 != null) {
                    abstractC1351869s = new AbstractC1351869s(cQLResultSet20);
                    return new MailboxNullable(abstractC1351869s);
                }
                abstractC1351869s = null;
                return new MailboxNullable(abstractC1351869s);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                C48181LUf c48181LUf = (C48181LUf) this.A01;
                return MailboxSecureConsentFrameworkJNI.dispatchDasmOIIOOZ(4, c48181LUf.A01, c48181LUf.A02, mailbox, sqliteHolder, c48181LUf.A05);
            case 43:
                return MailboxSecureConsentFrameworkJNI.dispatchDasmOIIOOO(5, 2, 4, ((LUF) this.A01).A03, mailbox, sqliteHolder);
            case 44:
                return MailboxShimJNI.dispatchCqlOJO(22, ((LVG) this.A01).A01, sqliteHolder);
            case 45:
                return MailboxShimJNI.dispatchCqlOJO(23, ((LVG) this.A01).A01, sqliteHolder);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                LUP lup2 = (LUP) this.A01;
                return MailboxShimJNI.dispatchCqlOJOO(24, lup2.A01, lup2.A04, sqliteHolder);
            case 47:
                C48183LUh c48183LUh = (C48183LUh) this.A01;
                return MailboxShimJNI.dispatchCqlOJOOO(25, c48183LUh.A01, c48183LUh.A05, c48183LUh.A04, sqliteHolder);
            case 48:
                C48182LUg c48182LUg = (C48182LUg) this.A01;
                return MailboxShimJNI.dispatchCqlOJJOOO(26, c48182LUg.A01, c48182LUg.A02, null, null, sqliteHolder);
            case 49:
                return MailboxShimJNI.dispatchCqlOJO(27, ((LUP) this.A01).A01, sqliteHolder);
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                LUG lug = (LUG) this.A01;
                return MailboxShimJNI.dispatchCqlOJJOO(31, lug.A00, lug.A01, null, sqliteHolder);
            case 51:
                C48182LUg c48182LUg2 = (C48182LUg) this.A01;
                return MailboxShimJNI.dispatchCqlOJJOOO(33, c48182LUg2.A01, c48182LUg2.A02, c48182LUg2.A05, null, sqliteHolder);
            case 52:
                return MailboxShimJNI.dispatchCqlOO(36, sqliteHolder);
            case 53:
                C48188LUm c48188LUm = (C48188LUm) this.A01;
                Object[] objArr = (Object[]) MailboxTamJNI.dispatchCqlOJOOO(14, c48188LUm.A02, c48188LUm.A06, c48188LUm.A05, sqliteHolder);
                return new LEF((Number) objArr[0], (Number) objArr[1]);
            case 54:
                C48199LUx c48199LUx = (C48199LUx) this.A01;
                return MailboxTamJNI.dispatchCqlOJJOOOO(15, c48199LUx.A02, c48199LUx.A01, c48199LUx.A05, c48199LUx.A06, c48199LUx.A07, sqliteHolder);
            case 55:
                return MailboxTamJNI.dispatchCqlOJOO(17, ((LVJ) this.A01).A02, null, sqliteHolder);
            case 56:
                LVI lvi2 = (LVI) this.A01;
                return MailboxTamJNI.dispatchCqlOJOOZ(24, lvi2.A02, lvi2.A05, sqliteHolder, false);
            case 57:
                LVI lvi3 = (LVI) this.A01;
                return MailboxTamJNI.dispatchCqlOJOO(29, lvi3.A02, lvi3.A05, sqliteHolder);
            case 58:
                return MailboxTamJNI.dispatchCqlOJO(31, ((LVJ) this.A01).A02, sqliteHolder);
            case 59:
                return MailboxTamJNI.dispatchCqlOJO(32, ((LVJ) this.A01).A02, sqliteHolder);
            case 60:
                return MailboxTamJNI.dispatchCqlOJO(33, ((LVJ) this.A01).A02, sqliteHolder);
            case 61:
                C48180LUe c48180LUe = (C48180LUe) this.A01;
                return MailboxTamJNI.dispatchCqlOJJO(41, c48180LUe.A02, c48180LUe.A03, sqliteHolder);
            case 62:
                return MailboxTamJNI.dispatchCqlOJO(54, ((LVJ) this.A01).A02, sqliteHolder);
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                abstractC1351869s = MailboxTamJNI.dispatchCqlOJO(55, ((LVJ) this.A01).A02, sqliteHolder);
                return new MailboxNullable(abstractC1351869s);
            case 64:
                return MailboxTamJNI.dispatchCqlOJO(56, ((LVJ) this.A01).A02, sqliteHolder);
            case 65:
                abstractC1351869s = MailboxTamJNI.dispatchCqlOO(59, sqliteHolder);
                return new MailboxNullable(abstractC1351869s);
            case 66:
                return MailboxTamJNI.dispatchCqlOJO(62, ((LVJ) this.A01).A02, sqliteHolder);
            case 67:
                return MailboxTamJNI.dispatchCqlOJO(63, ((LVJ) this.A01).A02, sqliteHolder);
            case 68:
                return MailboxTamJNI.dispatchCqlOJO(67, ((LVJ) this.A01).A02, sqliteHolder);
            case 69:
                C48180LUe c48180LUe2 = (C48180LUe) this.A01;
                return MailboxTamJNI.dispatchCqlOJJO(5, c48180LUe2.A03, c48180LUe2.A02, sqliteHolder);
            default:
                LVI lvi4 = (LVI) this.A01;
                return MailboxTamJNI.dispatchCqlOJOO(72, lvi4.A02, lvi4.A05, sqliteHolder);
        }
    }
}
