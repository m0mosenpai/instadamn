package com.facebook.rp.platform.metaai.rsys.voicestate;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC25236BEt;
import X.AbstractC43591JPw;
import X.C0T6;
import X.C14360o3;
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;

/* loaded from: classes9.dex */
public final class SearchViewModel extends C0T6 {

    @SerializedName("attribution_link")
    public final String attributionLink;

    @SerializedName("references_title")
    public final String[] referencesTitle;

    @SerializedName("search_engine")
    public final String searchEngine;

    @SerializedName("search_engine_icon_url")
    public final String searchEngineIconUrl;

    @SerializedName("search_query")
    public final String searchQuery;

    @SerializedName("search_result_uri")
    public final String[] searchResultUri;

    @SerializedName("source_url")
    public final String sourceUrl;

    public SearchViewModel(String[] strArr, String str, String str2, String str3, String[] strArr2, String str4, String str5) {
        AbstractC167007dF.A1G(strArr, 1, strArr2);
        this.searchResultUri = strArr;
        this.searchEngine = str;
        this.searchQuery = str2;
        this.attributionLink = str3;
        this.referencesTitle = strArr2;
        this.searchEngineIconUrl = str4;
        this.sourceUrl = str5;
    }

    public static /* synthetic */ SearchViewModel copy$default(SearchViewModel searchViewModel, String[] strArr, String str, String str2, String str3, String[] strArr2, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            strArr = searchViewModel.searchResultUri;
        }
        if ((i & 2) != 0) {
            str = searchViewModel.searchEngine;
        }
        if ((i & 4) != 0) {
            str2 = searchViewModel.searchQuery;
        }
        if ((i & 8) != 0) {
            str3 = searchViewModel.attributionLink;
        }
        if ((i & 16) != 0) {
            strArr2 = searchViewModel.referencesTitle;
        }
        if ((i & 32) != 0) {
            str4 = searchViewModel.searchEngineIconUrl;
        }
        if ((i & 64) != 0) {
            str5 = searchViewModel.sourceUrl;
        }
        return searchViewModel.copy(strArr, str, str2, str3, strArr2, str4, str5);
    }

    public final String[] component1() {
        return this.searchResultUri;
    }

    public final String component2() {
        return this.searchEngine;
    }

    public final String component3() {
        return this.searchQuery;
    }

    public final String component4() {
        return this.attributionLink;
    }

    public final String[] component5() {
        return this.referencesTitle;
    }

    public final String component6() {
        return this.searchEngineIconUrl;
    }

    public final String component7() {
        return this.sourceUrl;
    }

    public final SearchViewModel copy(String[] strArr, String str, String str2, String str3, String[] strArr2, String str4, String str5) {
        AbstractC167007dF.A1F(strArr, 0, strArr2);
        return new SearchViewModel(strArr, str, str2, str3, strArr2, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SearchViewModel) {
                SearchViewModel searchViewModel = (SearchViewModel) obj;
                if (!C14360o3.A0K(this.searchResultUri, searchViewModel.searchResultUri) || !C14360o3.A0K(this.searchEngine, searchViewModel.searchEngine) || !C14360o3.A0K(this.searchQuery, searchViewModel.searchQuery) || !C14360o3.A0K(this.attributionLink, searchViewModel.attributionLink) || !C14360o3.A0K(this.referencesTitle, searchViewModel.referencesTitle) || !C14360o3.A0K(this.searchEngineIconUrl, searchViewModel.searchEngineIconUrl) || !C14360o3.A0K(this.sourceUrl, searchViewModel.sourceUrl)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String getAttributionLink() {
        return this.attributionLink;
    }

    public final String[] getReferencesTitle() {
        return this.referencesTitle;
    }

    public final String getSearchEngine() {
        return this.searchEngine;
    }

    public final String getSearchEngineIconUrl() {
        return this.searchEngineIconUrl;
    }

    public final String getSearchQuery() {
        return this.searchQuery;
    }

    public final String[] getSearchResultUri() {
        return this.searchResultUri;
    }

    public final String getSourceUrl() {
        return this.sourceUrl;
    }

    public int hashCode() {
        return (((((((((((Arrays.hashCode(this.searchResultUri) * 31) + AbstractC167017dG.A0O(this.searchEngine)) * 31) + AbstractC167017dG.A0O(this.searchQuery)) * 31) + AbstractC167017dG.A0O(this.attributionLink)) * 31) + Arrays.hashCode(this.referencesTitle)) * 31) + AbstractC167017dG.A0O(this.searchEngineIconUrl)) * 31) + AbstractC25227BEk.A07(this.sourceUrl);
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("SearchViewModel(searchResultUri=");
        A1C.append(Arrays.toString(this.searchResultUri));
        A1C.append(", searchEngine=");
        A1C.append(this.searchEngine);
        A1C.append(AbstractC43591JPw.A00(232));
        A1C.append(this.searchQuery);
        A1C.append(", attributionLink=");
        A1C.append(this.attributionLink);
        A1C.append(", referencesTitle=");
        A1C.append(Arrays.toString(this.referencesTitle));
        A1C.append(", searchEngineIconUrl=");
        A1C.append(this.searchEngineIconUrl);
        A1C.append(", sourceUrl=");
        return AbstractC25236BEt.A0Y(this.sourceUrl, A1C);
    }
}
