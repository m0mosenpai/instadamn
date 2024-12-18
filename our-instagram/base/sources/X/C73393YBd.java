package X;

import com.facebook.advancedcryptotransport.mca.MailboxAdvancedCryptoTransportJNI;
import com.facebook.clientnotifications.mca.MailboxClientNotificationsJNI;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.instagramsecuremessage.mca.MailboxInstagramSecureMessageJNI;
import com.facebook.msys.cql.dataclasses.ReadOnlyMessageMetadataDataclassAdapter;
import com.facebook.msys.cql.dataclasses.XmaDataclassAdapter;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.mci.CQLResultSet;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;
import com.facebook.shim.mca.MailboxShimJNI;
import com.facebook.tam.mca.MailboxTamJNI;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;

/* renamed from: X.YBd, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73393YBd implements MailboxFeature.DbConnectionResolutionCallback {
    public final int A00;
    public final Object A01;

    public C73393YBd(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // com.facebook.msys.mca.MailboxFeature.DbConnectionResolutionCallback
    public final /* bridge */ /* synthetic */ Object run(Mailbox mailbox, SqliteHolder sqliteHolder) {
        AbstractC1351869s abstractC1351869s;
        switch (this.A00) {
            case 0:
                YBQ ybq = (YBQ) this.A01;
                return MailboxAdvancedCryptoTransportJNI.dispatchCqlOIJJOOZZ(8, ybq.A00, ybq.A02, ybq.A01, ybq.A05, sqliteHolder, ybq.A07, ybq.A06);
            case 1:
                YBN ybn = (YBN) this.A01;
                CQLResultSet cQLResultSet = (CQLResultSet) MailboxClientNotificationsJNI.dispatchCqlOOOOO(2, "main-app", ybn.A02, ybn.A03, sqliteHolder);
                if (cQLResultSet != null) {
                    abstractC1351869s = new AbstractC1351869s(cQLResultSet);
                    return new MailboxNullable(abstractC1351869s);
                }
                abstractC1351869s = null;
                return new MailboxNullable(abstractC1351869s);
            case 2:
                return new MailboxNullable(MailboxClientNotificationsJNI.dispatchCqlOJO(3, 172800L, sqliteHolder));
            case 3:
                YBP ybp = (YBP) this.A01;
                CQLResultSet cQLResultSet2 = (CQLResultSet) MailboxInstagramSecureMessageJNI.dispatchCqlOIIJJJO(14, ybp.A02, ybp.A00, ybp.A04, ybp.A03, Long.MIN_VALUE, sqliteHolder);
                if (cQLResultSet2 != null) {
                    abstractC1351869s = new AbstractC1351869s(cQLResultSet2);
                    return new MailboxNullable(abstractC1351869s);
                }
                abstractC1351869s = null;
                return new MailboxNullable(abstractC1351869s);
            case 4:
                YBT ybt = (YBT) this.A01;
                return new MailboxNullable(MailboxInstagramSecureMessageJNI.dispatchCqlOJOOOOOOOOOOZ(20, ybt.A01, ybt.A06, ybt.A0A, ybt.A05, ybt.A04, ybt.A09, ybt.A08, ybt.A0B, ybt.A07, ReadOnlyMessageMetadataDataclassAdapter.INSTANCE.toNullableRawObject((MS0) null), sqliteHolder, ybt.A0C));
            case 5:
                YBZ ybz = (YBZ) this.A01;
                Object[] objArr = (Object[]) MailboxInstagramSecureMessageJNI.dispatchCqlOJOOOOOOOOOOOOOOOOOOOOOOZ(23, ybz.A01, null, ybz.A0A, ybz.A0G, ybz.A0F, ybz.A0M, ybz.A0K, ybz.A0J, ybz.A0L, ybz.A0C, ybz.A0D, ybz.A0H, ybz.A0E, ybz.A0I, ybz.A0B, ReadOnlyMessageMetadataDataclassAdapter.INSTANCE.toNullableRawObject((MS0) null), ybz.A07, ybz.A06, ybz.A05, ybz.A04, ybz.A09, ybz.A08, sqliteHolder, ybz.A0N);
                return new LED((Number) objArr[1], (List) objArr[0]);
            case 6:
                YBV ybv = (YBV) this.A01;
                Object[] objArr2 = (Object[]) MailboxInstagramSecureMessageJNI.dispatchCqlOIIIIJJOOOOOOOOOOO(27, ybv.A04, ybv.A00, ybv.A02, ybv.A03, ybv.A05, ybv.A06, ybv.A0I, ybv.A0H, ybv.A0G, ybv.A09, ybv.A0E, ybv.A0C, ybv.A0D, ybv.A0A, ybv.A0F, ybv.A0B, sqliteHolder);
                return new Y03((Number) objArr2[0], (Number) objArr2[1], (Number) objArr2[2], (Number) objArr2[3]);
            case 7:
                YBX ybx = (YBX) this.A01;
                Object[] objArr3 = (Object[]) MailboxInstagramSecureMessageJNI.dispatchCqlOIIIIJOOOOOOOOOOOOOOOO(28, ybx.A04, ybx.A00, ybx.A02, ybx.A03, ybx.A05, ybx.A0L, ybx.A0K, ybx.A0J, ybx.A0E, ybx.A0C, null, ybx.A0G, ybx.A0H, ybx.A0A, ybx.A0B, ybx.A08, ybx.A09, ybx.A0D, ybx.A0I, ybx.A0F, sqliteHolder);
                return new C73307Xzy((Number) objArr3[0], (Number) objArr3[1], (Number) objArr3[2], (Number) objArr3[3]);
            case 8:
                YBW ybw = (YBW) this.A01;
                Object[] objArr4 = (Object[]) MailboxInstagramSecureMessageJNI.dispatchCqlOIIIIJOOOOOOOOOOOOOOOO(29, ybw.A04, ybw.A00, ybw.A02, ybw.A03, ybw.A05, ybw.A0K, ybw.A0J, ybw.A0I, ybw.A0D, ybw.A0C, null, ybw.A0F, ybw.A0G, ybw.A0A, ybw.A0B, ybw.A08, ybw.A09, null, ybw.A0H, ybw.A0E, sqliteHolder);
                return new C73308Xzz((Number) objArr4[0], (Number) objArr4[1], (Number) objArr4[2], (Number) objArr4[3]);
            case 9:
                YBY yby = (YBY) this.A01;
                Object[] objArr5 = (Object[]) MailboxInstagramSecureMessageJNI.dispatchCqlOIIIIJOOOOOOOOOOOOOOOO(30, yby.A04, yby.A00, yby.A02, yby.A03, yby.A05, yby.A0M, yby.A0L, yby.A0K, yby.A0A, yby.A0I, yby.A0D, yby.A0G, yby.A0H, yby.A0B, yby.A0C, yby.A08, yby.A09, yby.A0E, yby.A0J, yby.A0F, sqliteHolder);
                return new Y04((Number) objArr5[0], (Number) objArr5[1], (Number) objArr5[2], (Number) objArr5[3]);
            case 10:
                C73391YBb c73391YBb = (C73391YBb) this.A01;
                Object[] objArr6 = (Object[]) MailboxInstagramSecureMessageJNI.dispatchCqlOIIIIIIJOOOOOOOOOOOOOOOOZ(31, c73391YBb.A06, c73391YBb.A02, c73391YBb.A03, c73391YBb.A00, c73391YBb.A04, c73391YBb.A05, c73391YBb.A07, c73391YBb.A0N, c73391YBb.A0M, c73391YBb.A0J, c73391YBb.A0A, c73391YBb.A0K, c73391YBb.A0E, c73391YBb.A0D, c73391YBb.A0C, c73391YBb.A0B, c73391YBb.A0H, c73391YBb.A0I, null, c73391YBb.A0L, c73391YBb.A0G, c73391YBb.A0F, sqliteHolder, c73391YBb.A0O);
                return new Y02((Number) objArr6[0], (Number) objArr6[1], (Number) objArr6[2], (Number) objArr6[3]);
            case 11:
                C73390YBa c73390YBa = (C73390YBa) this.A01;
                Object[] objArr7 = (Object[]) MailboxInstagramSecureMessageJNI.dispatchCqlOIIIIJOOOOOOOOOOOOOOOOOOZ(32, c73390YBa.A04, c73390YBa.A00, c73390YBa.A02, c73390YBa.A03, c73390YBa.A05, c73390YBa.A0M, c73390YBa.A0L, c73390YBa.A0J, c73390YBa.A0K, c73390YBa.A0E, c73390YBa.A0A, c73390YBa.A0D, c73390YBa.A0N, c73390YBa.A0G, c73390YBa.A0H, c73390YBa.A0B, c73390YBa.A0C, c73390YBa.A08, c73390YBa.A09, null, c73390YBa.A0I, c73390YBa.A0F, sqliteHolder, false);
                return new Y00((Number) objArr7[0], (Number) objArr7[1], (Number) objArr7[2], (Number) objArr7[3]);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                YBU ybu = (YBU) this.A01;
                Object[] objArr8 = (Object[]) MailboxInstagramSecureMessageJNI.dispatchCqlOIIJOOOOOOOOOOOOOO(33, ybu.A01, ybu.A02, ybu.A03, ybu.A0H, ybu.A0G, ybu.A0A, null, ybu.A0D, ybu.A0E, ybu.A08, ybu.A09, ybu.A06, ybu.A07, ybu.A0B, ybu.A0F, ybu.A0C, sqliteHolder);
                return new Y01((Number) objArr8[0], (Number) objArr8[1], (Number) objArr8[2], (Number) objArr8[3]);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                YBS ybs = (YBS) this.A01;
                Object[] objArr9 = (Object[]) MailboxInstagramSecureMessageJNI.dispatchCqlOJOOOOOOOOOOOOOOOOOZ(38, ybs.A01, ybs.A0A, XmaDataclassAdapter.INSTANCE.toRawObject(ybs.A03), null, ybs.A07, ybs.A08, ybs.A05, ybs.A06, null, null, null, null, null, ybs.A09, null, null, null, sqliteHolder, false);
                return new C73302Xzt((Number) objArr9[0], (Number) objArr9[1], (Number) objArr9[2]);
            case 14:
                C73392YBc c73392YBc = (C73392YBc) this.A01;
                Object[] objArr10 = (Object[]) MailboxInstagramSecureMessageJNI.dispatchCqlOIIIIIIIJJOOOOOOOOOOOOOOOOOOOOOOOOOOOO(39, 4, c73392YBc.A04, c73392YBc.A00, c73392YBc.A05, c73392YBc.A06, c73392YBc.A02, c73392YBc.A03, c73392YBc.A07, c73392YBc.A08, c73392YBc.A0M, c73392YBc.A0L, c73392YBc.A0B, c73392YBc.A0D, null, null, null, null, null, null, null, null, c73392YBc.A0N, c73392YBc.A0O, null, null, null, null, "ig_sticker", c73392YBc.A0H, c73392YBc.A0G, "", c73392YBc.A0J, c73392YBc.A0I, null, c73392YBc.A0E, c73392YBc.A0C, sqliteHolder);
                return new Y0C((Number) objArr10[0], (Number) objArr10[1], (Number) objArr10[2], (Number) objArr10[3], (Number) objArr10[4]);
            case Process.SIGTERM /* 15 */:
                YBO ybo = (YBO) this.A01;
                CQLResultSet cQLResultSet3 = (CQLResultSet) MailboxInstagramSecureMessageJNI.dispatchCqlOOOO(41, ybo.A04, ybo.A03, sqliteHolder);
                if (cQLResultSet3 != null) {
                    abstractC1351869s = new AbstractC1351869s(cQLResultSet3);
                    return new MailboxNullable(abstractC1351869s);
                }
                abstractC1351869s = null;
                return new MailboxNullable(abstractC1351869s);
            case 16:
                YBR ybr = (YBR) this.A01;
                CQLResultSet cQLResultSet4 = (CQLResultSet) MailboxInstagramSecureMessageJNI.dispatchCqlOOOOOOOZ(42, ybr.A07, ybr.A04, ybr.A06, ybr.A05, ybr.A03, sqliteHolder, ybr.A08);
                if (cQLResultSet4 != null) {
                    abstractC1351869s = new AbstractC1351869s(cQLResultSet4);
                    return new MailboxNullable(abstractC1351869s);
                }
                abstractC1351869s = null;
                return new MailboxNullable(abstractC1351869s);
            case 17:
                C48178LUc c48178LUc = (C48178LUc) this.A01;
                return MailboxInstagramSecureMessageJNI.dispatchCqlOIJO(47, c48178LUc.A01, c48178LUc.A03, sqliteHolder);
            case 18:
                C48179LUd c48179LUd = (C48179LUd) this.A01;
                return MailboxInstagramSecureMessageJNI.dispatchCqlOJOO(49, c48179LUd.A02, c48179LUd.A04, sqliteHolder);
            case Process.SIGSTOP /* 19 */:
                C48179LUd c48179LUd2 = (C48179LUd) this.A01;
                return MailboxInstagramSecureMessageJNI.dispatchCqlOJOO(50, c48179LUd2.A02, c48179LUd2.A04, sqliteHolder);
            case 20:
                C48178LUc c48178LUc2 = (C48178LUc) this.A01;
                return MailboxInstagramSecureMessageJNI.dispatchCqlOIJO(71, c48178LUc2.A01, c48178LUc2.A03, sqliteHolder);
            case 21:
                CQLResultSet cQLResultSet5 = (CQLResultSet) MailboxInstagramSecureMessageJNI.dispatchCqlOJO(73, ((LUN) this.A01).A02, sqliteHolder);
                if (cQLResultSet5 != null) {
                    abstractC1351869s = new AbstractC1351869s(cQLResultSet5);
                    return new MailboxNullable(abstractC1351869s);
                }
                abstractC1351869s = null;
                return new MailboxNullable(abstractC1351869s);
            case 22:
                LUV luv = (LUV) this.A01;
                Object[] objArr11 = (Object[]) MailboxShimJNI.dispatchCqlOOOOZZZ(40, luv.A03, luv.A02, sqliteHolder, false, luv.A04, false);
                return new LEE((String) objArr11[1], (Number) objArr11[0]);
            case 23:
                C48178LUc c48178LUc3 = (C48178LUc) this.A01;
                return MailboxTamJNI.dispatchCqlOIJO(23, c48178LUc3.A01, c48178LUc3.A03, sqliteHolder);
            case 24:
                return MailboxTamJNI.dispatchCqlOJO(76, ((LUN) this.A01).A02, sqliteHolder);
            default:
                return MailboxTamJNI.dispatchCqlOJO(89, ((LUN) this.A01).A02, sqliteHolder);
        }
    }
}
