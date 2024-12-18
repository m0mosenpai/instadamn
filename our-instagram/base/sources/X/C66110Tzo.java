package X;

import com.instagram.autoplay.models.AutoplayCustomization;
import com.instagram.autoplay.models.AutoplayDowngradeReason;
import com.instagram.autoplay.models.AutoplayInitialSelectionSource;
import com.instagram.autoplay.models.AutoplayLoggingCustomizationSelectionType;
import com.instagram.autoplay.models.AutoplayRecentBufferingDiagnosis;
import com.instagram.autoplay.models.AutoplayUpgradeReason;

/* renamed from: X.Tzo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66110Tzo {
    public AutoplayLoggingCustomizationSelectionType A00;
    public AutoplayRecentBufferingDiagnosis A01;
    public Integer A02;
    public final C65863TvQ A03;
    public final C65873Tvc A04;
    public final C66106Tzh A05;
    public final C66107Tzi A06;
    public final C65870TvX A07;
    public final C65871TvY A08;

    public static final void A00(C66110Tzo c66110Tzo, AutoplayDowngradeReason autoplayDowngradeReason, AutoplayInitialSelectionSource autoplayInitialSelectionSource, AutoplayLoggingCustomizationSelectionType autoplayLoggingCustomizationSelectionType, AutoplayUpgradeReason autoplayUpgradeReason) {
        StringBuilder A11;
        AutoplayUpgradeReason autoplayUpgradeReason2;
        StringBuilder sb = new StringBuilder();
        sb.append("autoplay_customization_selected");
        sb.append(AbstractC167017dG.A0n(autoplayLoggingCustomizationSelectionType, "\t selectionType: ", new StringBuilder()));
        if (autoplayInitialSelectionSource != null) {
            sb.append(AbstractC167017dG.A0n(autoplayInitialSelectionSource, "\t initialSource: ", new StringBuilder()));
        }
        if (autoplayUpgradeReason == AutoplayUpgradeReason.TO_BE_DETERMINED) {
            Integer num = c66110Tzo.A02;
            if (num != null && num.intValue() < c66110Tzo.A04.A00()) {
                A11 = AbstractC166997dE.A11("\t upgradeReason: ");
                autoplayUpgradeReason2 = AutoplayUpgradeReason.MEMORY_FREED_UP;
            } else {
                AutoplayRecentBufferingDiagnosis autoplayRecentBufferingDiagnosis = c66110Tzo.A01;
                AutoplayRecentBufferingDiagnosis autoplayRecentBufferingDiagnosis2 = AutoplayRecentBufferingDiagnosis.CAN_BUFFER_MORE;
                if (autoplayRecentBufferingDiagnosis != autoplayRecentBufferingDiagnosis2 && c66110Tzo.A05.A00 == autoplayRecentBufferingDiagnosis2) {
                    A11 = AbstractC166997dE.A11("\t upgradeReason: ");
                    autoplayUpgradeReason2 = AutoplayUpgradeReason.NETWORK_CAN_BUFFER_MORE;
                }
            }
            A11.append(autoplayUpgradeReason2);
            AbstractC58318PtA.A1V(sb, A11);
        }
        if (autoplayDowngradeReason != null) {
            sb.append(AbstractC167017dG.A0n(autoplayDowngradeReason, "\t downgradeReason: ", new StringBuilder()));
        }
        A01(c66110Tzo, sb);
        c66110Tzo.A01 = c66110Tzo.A05.A00;
        c66110Tzo.A02 = Integer.valueOf(c66110Tzo.A04.A00());
        c66110Tzo.A00 = autoplayLoggingCustomizationSelectionType;
    }

    public static final void A01(C66110Tzo c66110Tzo, StringBuilder sb) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\t layout: ");
        sb2.append(c66110Tzo.A03.A00);
        AbstractC58318PtA.A1V(sb, sb2);
        C66107Tzi c66107Tzi = c66110Tzo.A06;
        AutoplayCustomization autoplayCustomization = c66107Tzi.A00;
        String str2 = null;
        if (autoplayCustomization != null) {
            str = autoplayCustomization.id;
        } else {
            str = null;
        }
        AbstractC50523MSb.A1N("\t autoplayCustomizationId: ", str, sb);
        AutoplayCustomization autoplayCustomization2 = c66107Tzi.A01;
        if (autoplayCustomization2 != null) {
            str2 = autoplayCustomization2.id;
        }
        AbstractC50523MSb.A1N("\t previousAutoplayCustomizationId: ", str2, sb);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("\t previousAutoplayCustomizationTime: ");
        StringBuilder A0Y = AbstractC50523MSb.A0Y(c66107Tzi.A03, sb3, sb);
        A0Y.append("\t memoryColor: ");
        C65873Tvc c65873Tvc = c66110Tzo.A04;
        A0Y.append(c65873Tvc.A01.A00);
        AbstractC58318PtA.A1V(sb, A0Y);
        sb.append(AnonymousClass001.A0O("\t maximumConcurrentVideos: ", c65873Tvc.A00()));
        C66106Tzh c66106Tzh = c66110Tzo.A05;
        Long l = c66106Tzh.A01;
        if (l != null) {
            sb.append(AbstractC167017dG.A0n(l, "\t averageLoadingAndBufferingTime: ", new StringBuilder()));
        }
        AutoplayRecentBufferingDiagnosis autoplayRecentBufferingDiagnosis = c66106Tzh.A00;
        if (autoplayRecentBufferingDiagnosis != null) {
            sb.append(AbstractC167017dG.A0n(autoplayRecentBufferingDiagnosis, "\t bufferingDiagnosis: ", new StringBuilder()));
        }
        sb.append("\t deviceInfo: TODO: add once we have deviceInfo from endpoint");
        c66110Tzo.A08.A01().isEmpty();
        C65870TvX c65870TvX = c66110Tzo.A07;
        C65870TvX.A00(c65870TvX);
        c65870TvX.A03.isEmpty();
        C14360o3.A07(sb.toString());
    }

    public C66110Tzo(C65863TvQ c65863TvQ, C65873Tvc c65873Tvc, C66106Tzh c66106Tzh, C66107Tzi c66107Tzi, C65870TvX c65870TvX, C65871TvY c65871TvY) {
        this.A06 = c66107Tzi;
        this.A08 = c65871TvY;
        this.A07 = c65870TvX;
        this.A03 = c65863TvQ;
        this.A04 = c65873Tvc;
        this.A05 = c66106Tzh;
    }
}
