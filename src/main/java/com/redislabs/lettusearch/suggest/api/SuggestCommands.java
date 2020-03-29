package com.redislabs.lettusearch.suggest.api;

import java.util.List;

import com.redislabs.lettusearch.suggest.SuggetOptions;
import com.redislabs.lettusearch.suggest.SuggetResult;

/**
 * Synchronously executed commands for RediSearch suggestion index.
 *
 * @param <K> Key type.
 * @param <V> Value type.
 * @author Julien Ruaux
 * @since 1.0
 */
public interface SuggestCommands<K, V> {

	Long sugadd(K key, V string, double score, boolean increment, V payload);

	List<SuggetResult<V>> sugget(K key, V prefix, SuggetOptions options);

	Boolean sugdel(K key, V string);

	Long suglen(K key);
}
