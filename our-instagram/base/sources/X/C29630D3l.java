package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.creation.genai.memu.consentflow.api.MemuCreatorTemplatesConsentGraphQLApi;
import com.instagram.creation.genai.memu.util.MEmuUtil;
import com.instagram.creator.agent.disclosure.inthread.repository.CreatorAIFanNuxRepository;
import com.instagram.creator.agent.settings.audience.AudienceRepository;
import com.instagram.creator.agent.settings.avoidedtopics.repository.AvoidedTopicsRepository;
import com.instagram.creator.agent.settings.content.sources.fetch.IGCreatorAIContentCategoriesRepository;
import com.instagram.creator.agent.settings.facts.repository.FactsRepository;
import com.instagram.creator.agent.settings.keyword.KeywordRepository;
import com.instagram.creator.agent.settings.repository.CreatorAiSettingsRepository;
import com.instagram.creator.agent.settings.summary.BioSummaryRepository;
import com.instagram.creator.ghostwriter.graphql.GhostWriterGraphQLDataSource;
import com.instagram.creatortools.api.CreatorToolsMonetizationApi;
import com.instagram.direct.avatar.powerups.repository.AvatarPowerupsAssetsStashDownloader;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* renamed from: X.D3l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29630D3l extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29630D3l(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A03 = i;
        this.A01 = obj;
    }

    public static Object A00(Object obj, C29630D3l c29630D3l) {
        c29630D3l.A02 = obj;
        c29630D3l.A00 |= Integer.MIN_VALUE;
        return c29630D3l.A01;
    }

    public static C29630D3l A01(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        return new C29630D3l(obj, interfaceC23621Ds, i, 42);
    }

    public static void A02(Object obj, C29630D3l c29630D3l) {
        c29630D3l.A01 = obj;
        c29630D3l.A00 |= Integer.MIN_VALUE;
    }

    public static boolean A03(Object obj, int i) {
        if ((obj instanceof C29630D3l) && ((C29630D3l) obj).A03 == i) {
            return true;
        }
        return false;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        switch (this.A03) {
            case 0:
            case 1:
            case 2:
                return ((C25239BEx) A00(obj, this)).emit(null, this);
            case 3:
                A02(obj, this);
                return ((MemuCreatorTemplatesConsentGraphQLApi) this.A02).A00(null, this);
            case 4:
                A02(obj, this);
                return ((MEmuUtil) this.A02).A01(null, this);
            case 5:
                A02(obj, this);
                return ((MEmuUtil) this.A02).A00(null, null, this);
            case 6:
                A02(obj, this);
                return ((MEmuUtil) this.A02).A02(null, this);
            case 7:
                A02(obj, this);
                return ((MEmuUtil) this.A02).A03(null, this, false);
            case 8:
            case 9:
            case 35:
                return ((C25588BTb) A00(obj, this)).emit(null, this);
            case 10:
                A02(obj, this);
                return ((CreatorAIFanNuxRepository) this.A02).A01(this);
            case 11:
                A02(obj, this);
                return ((CreatorAIFanNuxRepository) this.A02).A02(this);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A02(obj, this);
                return ((CreatorAIFanNuxRepository) this.A02).A03(this);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A02(obj, this);
                return ((CreatorAIFanNuxRepository) this.A02).A04(this);
            case 14:
                A02(obj, this);
                return ((AudienceRepository) this.A02).A04(this);
            case Process.SIGTERM /* 15 */:
                A02(obj, this);
                return ((AudienceRepository) this.A02).A05(this);
            case 16:
                A02(obj, this);
                return ((AudienceRepository) this.A02).A06(this);
            case 17:
                A02(obj, this);
                return ((AudienceRepository) this.A02).A01(null, null, this);
            case 18:
                A02(obj, this);
                return ((AudienceRepository) this.A02).A00(null, this);
            case Process.SIGSTOP /* 19 */:
                A02(obj, this);
                return ((AudienceRepository) this.A02).A02(null, null, null, this);
            case 20:
                A02(obj, this);
                return ((AvoidedTopicsRepository) this.A02).A00(null, null, null, null, this);
            case 21:
                A02(obj, this);
                return ((IGCreatorAIContentCategoriesRepository) this.A02).A00(null, this, false);
            case 22:
                A02(obj, this);
                return ((FactsRepository) this.A02).A01(null, this);
            case 23:
                A02(obj, this);
                return ((FactsRepository) this.A02).A02(null, null, null, this);
            case 24:
                A02(obj, this);
                return ((KeywordRepository) this.A02).A06(null, this);
            case 25:
                A02(obj, this);
                return ((KeywordRepository) this.A02).A07(null, this);
            case 26:
                A02(obj, this);
                return ((CreatorAiSettingsRepository) this.A02).A00(null, this, 0);
            case 27:
                A02(obj, this);
                return ((BioSummaryRepository) this.A02).A02(this);
            case 28:
                A02(obj, this);
                return ((GhostWriterGraphQLDataSource) this.A02).A00(null, null, this);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                A02(obj, this);
                return ((GhostWriterGraphQLDataSource) this.A02).A01(null, null, this);
            case 30:
                A02(obj, this);
                return ((CreatorToolsMonetizationApi) this.A02).A03(this);
            case 31:
                A02(obj, this);
                return ((CreatorToolsMonetizationApi) this.A02).A02(null, this);
            case 32:
                A02(obj, this);
                return ((CreatorToolsMonetizationApi) this.A02).A00(null, null, this);
            case 33:
                A02(obj, this);
                return ((CreatorToolsMonetizationApi) this.A02).A01(null, null, this);
            case 34:
                A02(obj, this);
                return ((AvatarPowerupsAssetsStashDownloader) this.A02).AQE(null, this);
            case 36:
            case 38:
            case 39:
            case Seq.NULL_REFNUM /* 41 */:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
            case 43:
            case 45:
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return ((BU4) A00(obj, this)).emit(null, this);
            case 37:
                A02(obj, this);
                return ((BU4) this.A02).A00(null, this);
            case 40:
                return ((JRY) A00(obj, this)).emit(null, this);
            case 44:
                return ((JWH) A00(obj, this)).emit(null, this);
            default:
                return ((C31202Dnl) A00(obj, this)).emit(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29630D3l(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i, int i2) {
        super(interfaceC23621Ds);
        this.A03 = i;
        this.A02 = obj;
    }
}
