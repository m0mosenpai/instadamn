package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.EventPageNavigationMetadata;
import com.instagram.api.schemas.EventPageNavigationMetadataImpl;
import com.instagram.api.schemas.IGLocalEventDict;
import com.instagram.api.schemas.IGLocalEventDictImpl;
import com.instagram.api.schemas.UpcomingEventIDType;
import com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia;
import com.instagram.model.upcomingeventsmetadata.UpcomingEventMediaImpl;
import com.instagram.user.model.ImmutablePandoUpcomingEvent;
import com.instagram.user.model.UpcomingDropCampaignEventMetadata;
import com.instagram.user.model.UpcomingDropCampaignEventMetadataImpl;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.UpcomingEventImpl;
import com.instagram.user.model.UpcomingEventLiveMetadata;
import com.instagram.user.model.UpcomingEventLiveMetadataImpl;
import com.instagram.user.model.User;

/* renamed from: X.IMc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C41213IMc {
    public long A00;
    public EventPageNavigationMetadata A01;
    public IGLocalEventDict A02;
    public UpcomingEventIDType A03;
    public UpcomingEventMedia A04;
    public UpcomingDropCampaignEventMetadata A05;
    public UpcomingEventLiveMetadata A06;
    public User A07;
    public Boolean A08;
    public Long A09;
    public Long A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public boolean A0E;
    public final UpcomingEvent A0F;

    public final UpcomingEvent A00() {
        UpcomingDropCampaignEventMetadataImpl upcomingDropCampaignEventMetadataImpl;
        EventPageNavigationMetadataImpl eventPageNavigationMetadataImpl;
        IGLocalEventDictImpl iGLocalEventDictImpl;
        Object obj;
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        TreeUpdaterJNI treeUpdaterJNI3;
        TreeUpdaterJNI treeUpdaterJNI4;
        TreeUpdaterJNI treeUpdaterJNI5;
        int A00 = AbstractC37301Gc2.A00(new C37761pD(null));
        UpcomingEvent upcomingEvent = this.A0F;
        if (upcomingEvent instanceof ImmutablePandoUpcomingEvent) {
            UpcomingDropCampaignEventMetadata upcomingDropCampaignEventMetadata = this.A05;
            if (upcomingDropCampaignEventMetadata != null) {
                treeUpdaterJNI = upcomingDropCampaignEventMetadata.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            C09530e4 A1L = AbstractC166987dD.A1L("drops_campaign_metadata", treeUpdaterJNI);
            C09530e4 A1L2 = AbstractC166987dD.A1L("end_time", this.A09);
            EventPageNavigationMetadata eventPageNavigationMetadata = this.A01;
            if (eventPageNavigationMetadata != null) {
                treeUpdaterJNI2 = eventPageNavigationMetadata.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            C09530e4 A1L3 = AbstractC166987dD.A1L("event_page_metadata", treeUpdaterJNI2);
            C09530e4 A1L4 = AbstractC166987dD.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, this.A0B);
            IGLocalEventDict iGLocalEventDict = this.A02;
            if (iGLocalEventDict != null) {
                treeUpdaterJNI3 = iGLocalEventDict.F7o();
            } else {
                treeUpdaterJNI3 = null;
            }
            C09530e4 A1L5 = AbstractC166987dD.A1L("ig_local_event_dict", treeUpdaterJNI3);
            C09530e4 A1L6 = AbstractC166987dD.A1L("is_ig_local_event", this.A08);
            C09530e4 A1L7 = AbstractC166987dD.A1L("last_notification_time", this.A0A);
            UpcomingEventLiveMetadata upcomingEventLiveMetadata = this.A06;
            if (upcomingEventLiveMetadata != null) {
                treeUpdaterJNI4 = upcomingEventLiveMetadata.F7o();
            } else {
                treeUpdaterJNI4 = null;
            }
            C09530e4 A1L8 = AbstractC166987dD.A1L("live_metadata", treeUpdaterJNI4);
            UpcomingEventMedia upcomingEventMedia = this.A04;
            if (upcomingEventMedia != null) {
                treeUpdaterJNI5 = upcomingEventMedia.F7o();
            } else {
                treeUpdaterJNI5 = null;
            }
            C09530e4 A1L9 = AbstractC166987dD.A1L("media", treeUpdaterJNI5);
            User user = this.A07;
            C09530e4 A1L10 = AbstractC166987dD.A1L("owner", user != null ? user.A07() : null);
            C09530e4 A1L11 = AbstractC166987dD.A1L("reminder_enabled", Boolean.valueOf(this.A0E));
            C09530e4 A1L12 = AbstractC166987dD.A1L(TraceFieldType.StartTime, Long.valueOf(this.A00));
            C09530e4 A1L13 = AbstractC166987dD.A1L("strong_id__", this.A0C);
            C09530e4 A1L14 = AbstractC166987dD.A1L(DialogModule.KEY_TITLE, this.A0D);
            UpcomingEventIDType upcomingEventIDType = this.A03;
            C14360o3.A0B(upcomingEventIDType, 0);
            obj = AbstractC37303Gc4.A06(upcomingEvent, new C09530e4[]{A1L, A1L2, A1L3, A1L4, A1L5, A1L6, A1L7, A1L8, A1L9, A1L10, A1L11, A1L12, A1L13, A1L14, AbstractC166987dD.A1L("upcoming_event_id_type", upcomingEventIDType.A00)});
        } else {
            UpcomingEventMediaImpl upcomingEventMediaImpl = null;
            C1DY A0C = AbstractC37302Gc3.A0C(A00);
            UpcomingDropCampaignEventMetadata upcomingDropCampaignEventMetadata2 = this.A05;
            if (upcomingDropCampaignEventMetadata2 != null) {
                upcomingDropCampaignEventMetadataImpl = upcomingDropCampaignEventMetadata2.F7Y(A0C);
            } else {
                upcomingDropCampaignEventMetadataImpl = null;
            }
            Long l = this.A09;
            EventPageNavigationMetadata eventPageNavigationMetadata2 = this.A01;
            if (eventPageNavigationMetadata2 != null) {
                eventPageNavigationMetadataImpl = eventPageNavigationMetadata2.EtE();
            } else {
                eventPageNavigationMetadataImpl = null;
            }
            String str = this.A0B;
            IGLocalEventDict iGLocalEventDict2 = this.A02;
            if (iGLocalEventDict2 != null) {
                iGLocalEventDictImpl = iGLocalEventDict2.Ev7();
            } else {
                iGLocalEventDictImpl = null;
            }
            Boolean bool = this.A08;
            Long l2 = this.A0A;
            UpcomingEventLiveMetadata upcomingEventLiveMetadata2 = this.A06;
            UpcomingEventLiveMetadataImpl F7c = upcomingEventLiveMetadata2 != null ? upcomingEventLiveMetadata2.F7c(A0C) : null;
            UpcomingEventMedia upcomingEventMedia2 = this.A04;
            if (upcomingEventMedia2 != null) {
                upcomingEventMediaImpl = upcomingEventMedia2.F6f();
            }
            obj = new UpcomingEventImpl(eventPageNavigationMetadataImpl, iGLocalEventDictImpl, this.A03, upcomingEventMediaImpl, upcomingDropCampaignEventMetadataImpl, F7c, this.A07, bool, l, l2, str, this.A0C, this.A0D, this.A00, this.A0E);
        }
        return (UpcomingEvent) obj;
    }

    public C41213IMc(UpcomingEvent upcomingEvent) {
        this.A0F = upcomingEvent;
        this.A05 = upcomingEvent.Aza();
        this.A09 = upcomingEvent.B24();
        this.A01 = upcomingEvent.B2l();
        this.A0B = upcomingEvent.getId();
        this.A02 = upcomingEvent.BG0();
        this.A08 = upcomingEvent.CW7();
        this.A0A = upcomingEvent.BLn();
        this.A06 = upcomingEvent.BNx();
        this.A04 = upcomingEvent.BQO();
        this.A07 = upcomingEvent.Bah();
        this.A0E = upcomingEvent.getReminderEnabled();
        this.A00 = upcomingEvent.getStartTime();
        this.A0C = upcomingEvent.getStrongId();
        this.A0D = upcomingEvent.getTitle();
        this.A03 = upcomingEvent.CD5();
    }
}
